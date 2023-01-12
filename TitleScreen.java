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
        if(Greenfoot.isKeyDown("space"))
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
        Label label = new Label("Man vs Aliens", 89);
        addObject(label,300,170);
        label.setLocation(350,87);
        Label label2 = new Label("Press <Space> to Start", 50);
        addObject(label2,465,295);
        label2.setLocation(350,460);
        AlienForBackGround alienForBackGround = new AlienForBackGround();
        addObject(alienForBackGround,565,257);
        alienForBackGround.setLocation(571,265);
        PlaneForBackGround planeForBackGround = new PlaneForBackGround();
        addObject(planeForBackGround,164,288);
        planeForBackGround.setLocation(170,285);
    }

}
