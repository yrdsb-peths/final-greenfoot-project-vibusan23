import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Explosion class that will be used as an animation.
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class Explosion extends Actor
{
    private GreenfootImage[] idle = new GreenfootImage[5];
    private SimpleTimer animationTimer = new SimpleTimer();
    private int imageIndex = 0;
    
    //constructor for the Explosion
    public Explosion()
    {
        //animates the explosion
        for (int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/tile00" + i + ".png");
            idle[i].scale(63, 63);
        }
        
        //sets image at where the array is at
        setImage(idle[0]);
        
    }
    
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        animateExplosion();
    }

    //method for explosion animation
    public void animateExplosion()
    {
        if (animationTimer.millisElapsed() < 50)
        {
            return;
        }
        if (imageIndex == idle.length)
        {
            getWorld().removeObject(this);
            return;
        }
        animationTimer.mark();
        
        //sets the image at the index its at.
        setImage(idle[imageIndex]);
        imageIndex++;
    }
}
