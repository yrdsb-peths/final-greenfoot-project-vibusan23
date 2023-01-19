import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will be the Mystery box item in the game.
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class MysteryBox extends Actor
{
    //gets a random number from 0 to 2
    private int effect = Greenfoot.getRandomNumber(2);
    
    //constructor for the mystery box
    public MysteryBox()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    /**
     * Act - do whatever the MysteryBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.isTouching(Man.class))
        {
            if (effect == 0)
            {
                //the ship gains speed when touching the mystery box
                ((MyWorld) getWorld()).increaseShipSpeed();
            }
            
            else if(effect == 1)
            {
                //the ship gets faster reload time when touching the mystery box.
                ((MyWorld) getWorld()).lowerShootDelayMax();
            }
            
            else if(effect == 2)
            {
                //you don't get anything here as a troll effect.
            }
            getWorld().removeObject(this);
        }
    }
}   
