import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    Label scoreLabel;
    int level = 1;
    int alienTimer = 100;
    int alienTimerMax = 100;
    
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
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void createAlien()
    {
        Alien ufo = new Alien();
        int x = 546;
        int y = Greenfoot.getRandomNumber(400);
        addObject(ufo, x, y);
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
