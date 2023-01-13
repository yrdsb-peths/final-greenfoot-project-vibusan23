import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Bullet Class. This is what kills the aliens
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        
        //deletes the bullet when it reaches the end of the world
        if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        //deletes the alien when the bullet touches it.
        else if(this.isTouching(Alien.class))
        {
            ((MyWorld) getWorld()).increaseScore();
            
            int score = ((MyWorld) getWorld()).getScore();
            if (score % 10 == 0 && score != 0)
            {
                ((MyWorld) getWorld()).createMysteryBox();
            }

            removeTouching(Alien.class);
            getWorld().removeObject(this);
        }
    }
    
    
}
