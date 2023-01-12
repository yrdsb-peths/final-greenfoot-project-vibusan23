import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        
        if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        else if(this.isTouching(Alien.class))
        {
            //Alien alien = (Alien) getOneIntersectingObject(Alien.class);
            removeTouching(Alien.class);
            getWorld().removeObject(this);
        }
    }
    
    
}
