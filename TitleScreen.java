import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"));
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Man V Aliens", 89);
        addObject(label,336,170);
        label.setLocation(405,87);
        Label label2 = new Label("Press <Space> to Start", 50);
        addObject(label2,353,296);
        label.setLocation(367,75);
        label2.setLocation(350,426);
        label2.setLocation(336,443);
    }
}
