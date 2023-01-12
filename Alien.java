import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    
    public Alien()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    int speed = 1;
    public void act()
    {        
        int x = getX() - speed;
        int y = getY();
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if (getX() <= 0)
        {
            world.removeObject(this);
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
        
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
}
