import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be the screen for the end of the game.
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        GreenfootImage image = getBackground();
        image.scale(760, 710);
        setBackground(image);
    }
    
    
}
