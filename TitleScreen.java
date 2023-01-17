import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * This is the code for the Title Screen
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        prepare();
    }

    /**
     * This code will be the actor for the Title Screen.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            InstructionPage instructions = new InstructionPage();
            Greenfoot.setWorld(instructions);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Man vs Aliens", 89);
        addObject(label,350,87);
        Label label2 = new Label("Press <Space> to Start", 50);
        addObject(label2,350,460);
        AlienForBackGround alienForBackGround = new AlienForBackGround();
        addObject(alienForBackGround,571,265);
        PlaneForBackGround planeForBackGround = new PlaneForBackGround();
        addObject(planeForBackGround,170,265);
    }

}
