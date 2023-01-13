import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is used for the fighter jet that will be used as the ship that 
 * the player will use to shoot the aliens
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class Man extends Actor
{    
    private int shootDelay = 35;
    private int SHOOT_DELAY_MAX;
    private int shipSpeed;
    
    /**
     * This is the constructor for Man
     */
    public Man()
    {
        GreenfootImage image = getImage();
        image.scale(150,150);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        int x = getX();
        int y = getY();
        SHOOT_DELAY_MAX = ((MyWorld) getWorld()).getShootDelayMax();
        shipSpeed = ((MyWorld) getWorld()).getShipSpeed();
        
        if(Greenfoot.isKeyDown("up"))
        {
            y -= shipSpeed;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            y += shipSpeed;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            x += shipSpeed;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            x -= shipSpeed;
        }
    
        //this sets the location
        setLocation(x, y);
        
        //this causes delay in the shot
        shootDelay++;
        
        //this shoots the bullet
        if(Greenfoot.isKeyDown("space"))
        {
            if (shootDelay >= SHOOT_DELAY_MAX)
            {
                shotFired();
                shootDelay = 0;
            }
            
        }
        
    }
    
    
    /**
     * This is the method used for shooting the bullet
     */
    public void shotFired()
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
    }
}
