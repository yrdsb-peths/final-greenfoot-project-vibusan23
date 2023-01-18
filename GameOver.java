import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be the screen for the end of the game.
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class GameOver extends World
{
    public void act()
    {
        //creates a goes to the titlescreen when space is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            TitleScreen title = new TitleScreen();
            Greenfoot.setWorld(title);
        }
    }

    /**
     * Constructor for objects of class GameOver.
     * 
     */

    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage image = getBackground();
        image.scale(600, 400);
        setBackground(image);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("GAME OVER!", 60);
        addObject(label,300,200);

        Label label2 = new Label("Press <Space> to try again!", 40);
        addObject(label2,300,305);
    }
}
