import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will be the instruction page
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class InstructionPage extends World
{

    /**
     * Constructor for objects of class InstructionPage.
     * 
     */
    public InstructionPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage image = getBackground();
        image.scale(600, 400);
        setBackground(image);
        prepare();
    }
    
    /**
     * This code will be the Actor for Alien
     */
    public void act()
    {
        //starts the actual video game.
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
        Label label = new Label("You play as the Man and will shoot the Aliens", 30);
        addObject(label,300,150);
        Label label2 = new Label("INSTRUCTIONS", 50);
        addObject(label2,300,65);
        Label label3 = new Label("Arrow Key - Movement", 30);
        addObject(label3,300,210);
        Label label4 = new Label("Spacebar - Fire/Shoot", 30);
        addObject(label4,300,267);
        Label label5 = new Label("If the aliens reach the end or touch the plane, you lose!", 27);
        addObject(label5,300,320);
    }
}
