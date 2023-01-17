import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the game will be taking place 
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class MyWorld extends World
{
    private int score = 0;
    Label scoreLabel;
    int level = 1;
    int alienTimer = 100;
    int alienTimerMax = 100;
    int aliensMade = 0;
    private int SHOOT_DELAY_MAX = 65;
    private int shipSpeed = 3;
    
    /**
     * This code below is the code for the Actor for the World
     */
    
    public void act()
    {
        //it creates more aliens over time
        if (alienTimer >= alienTimerMax)
        {
            createAlien();
            alienTimer = 0;
            
            aliensMade++;
            if (aliensMade % 5 == 0)
            {
                alienTimerMax = alienTimerMax - 2;
            }
        }
            
        alienTimer++;
    }
    
    
    //Create a new world with 600x400 cells with a cell size of 1x1 pixels. 
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    
    //This code will create a UFO.
    public void createAlien()
    {
        Alien ufo = new Alien();
        int x = 546;
        int y = Greenfoot.getRandomNumber(400);
        addObject(ufo, x, y);
    }
    
    //creates Mystery Box
    public void createMysteryBox()
    {
        MysteryBox box = new MysteryBox();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400); 
        addObject(box, x, y);
    }
    
    
    //This code will be used to increase the score which is counted when a Alien is killed.
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
        
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel,25,26);
    }
    
    public int getScore()
    {
        //gets the score
        return score;
    }
    
    public void lowerShootDelayMax()
    {
        //lowers the shoot delay
        SHOOT_DELAY_MAX = SHOOT_DELAY_MAX - 1;
    }
    
    public void increaseShipSpeed()
    {
        //increase the ship speed
        shipSpeed = shipSpeed + 1;
    }
    
    public int getShootDelayMax()
    {
        //getter method for shoot delay
        return SHOOT_DELAY_MAX;
    }
    
    
    public int getShipSpeed()
    {
        //getter method for ship speed
        return shipSpeed;
    }
}