import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MysteryBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MysteryBox extends Actor
{
    private int effect = Greenfoot.getRandomNumber(2);
    
    public MysteryBox()
    {
        GreenfootImage image = getImage();
        image.scale(65,65);
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
                ((MyWorld) getWorld()).increaseShipSpeed();
            }
            
            else if(effect == 1)
            {
                ((MyWorld) getWorld()).lowerShootDelayMax();
            }
            
            else if(effect == 2)
            {
                //you don't get anything here as a troll effect LOL
            }
            getWorld().removeObject(this);
        }
    }
}   
