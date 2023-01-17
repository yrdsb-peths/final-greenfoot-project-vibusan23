import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * This is the code for the Alien/UFO in the game
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class Alien extends Actor
{
    /**
     * This code will be the Constructor for Alien 
     */
    public Alien()
    {
        //sizes the alien
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    int speed = 2;
    
    /**
     * This code will be the Actor for ALien
     */
    public void act()
    {   
        //gets the coordinates
        int x = getX() - speed;
        int y = getY();
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        //this code will make the game end when the alien gets to the end
        if (getX() <= 0)
        {
            world.removeObject(this);
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
        
        //this code will make the game end when the alien touches the man
        else if (this.isTouching(Man.class))
        {
            world.removeObject(this);
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
        
        
    }
    
    /**
     * This code sets the speed
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
}
