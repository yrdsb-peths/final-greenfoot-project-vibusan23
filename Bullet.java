import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Bullet Class. This is what kills the aliens
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class Bullet extends Actor
{
    public Bullet()
    {
        //scales the bullet
        GreenfootImage image = getImage();
        image.scale(40,15);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move(3);
        
        if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        else if(this.isTouching(Alien.class))
        {
            //increases score when alien is killed
            ((MyWorld) getWorld()).increaseScore();
            
            int score = ((MyWorld) getWorld()).getScore();
            if (score % 20 == 0 && score != 0)
            {
                //creates a mysterybox
                ((MyWorld) getWorld()).createMysteryBox();
            }
            
            //deletes the alien when the bullet touches it.
            removeTouching(Alien.class);
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
    
    
}
