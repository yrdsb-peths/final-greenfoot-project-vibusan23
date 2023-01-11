import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Man()
    {
        GreenfootImage image = getImage();
        image.scale(150,150);
        setImage(image);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("up"))
        {
            y -= 2;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            y += 2;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            x += 2;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            x -= 2;
        }
        
        setLocation(x, y);
        
    }
}
