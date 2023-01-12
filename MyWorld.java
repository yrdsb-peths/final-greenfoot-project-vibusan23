import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the game will be taking place 
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    int alienTimer = 100;
    int alienTimerMax = 100;
    
    /**
     * This code below is the code for the Actor for the World
     */

    public void act()
    {
        if (alienTimer >= alienTimerMax)
        {
            createAlien();
            alienTimer = 0;
        }
        alienTimer++;
    }
    
    /**
     * Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    /**
     * This code will create a UFO
     */
    
    public void createAlien()
    {
        Alien ufo = new Alien();
        int x = 546;
        int y = Greenfoot.getRandomNumber(400);
        addObject(ufo, x, y);
    }
    
    /**
     * This code will be used to increase the score which is counted when a Alien is killed
     */
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Man man = new Man();
        addObject(man,125,210);
    }
}
