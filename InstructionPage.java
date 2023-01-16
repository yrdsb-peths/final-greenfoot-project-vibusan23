import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        Label label = new Label("The objective of this game is to kill the Zombies", 30);
        addObject(label,267,166);
        Label label2 = new Label("In this game, you play as the man in the plane", 32);
        addObject(label2,291,143);
        Label label3 = new Label("Your controls are:", 32);
        addObject(label3,20,283);
        Label label4 = new Label("The Arrow Keys - Movement Controls", 25);
        addObject(label4,380,287);
        label4.setLocation(420,278);
        label.setLocation(300,157);
        label2.setLocation(389,112);
        label3.setLocation(135,279);
        Label label5 = new Label("If the Zombies hit the end of the world or touch your plane, the GAME ENDS!", 20);
        addObject(label5,265,221);
        label5.setLocation(300,207);
        Label label6 = new Label("Instructions", 35);
        addObject(label6,300,53);
    }
}
