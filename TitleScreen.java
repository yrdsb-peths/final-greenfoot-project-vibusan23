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
        label2.setLocation(404,434);
        label2.setLocation(370,437);
        AlienForBackGround alienForBackGround = new AlienForBackGround();
        addObject(alienForBackGround,565,257);
        alienForBackGround.setLocation(571,265);
        PlaneForBackGround planeForBackGround = new PlaneForBackGround();
        addObject(planeForBackGround,164,288);
        planeForBackGround.setLocation(208,276);
        alienForBackGround.setLocation(599,268);
        alienForBackGround.setLocation(553,267);
        planeForBackGround.setLocation(184,260);
        alienForBackGround.setLocation(566,233);
        planeForBackGround.setLocation(113,267);
    }
}
