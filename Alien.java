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
    int speed = 1;
    public void act()
    {        
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if (getX() >= world.getWidth())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
