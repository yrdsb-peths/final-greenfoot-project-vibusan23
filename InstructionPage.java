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
        prepare();
    }
    
    /**
     * This code will be the Actor for ALien
     */
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
        Label label = new Label("The objective of this game is to kill the Zombies.", 30);
        addObject(label,267,166);
        Label label2 = new Label("In this game, you play as the man in the plane.", 32);
        addObject(label2,291,143);
        label.setLocation(300,157);
        label2.setLocation(300,112);
        Label label5 = new Label("If the Zombies hit the end of the world or touch your plane, the GAME ENDS!.", 20);
        addObject(label5,265,221);
        label5.setLocation(300,207);
        Label label6 = new Label("Instructions", 35);
        addObject(label6,300,53);
        Label label4 = new Label("Your controls are the Arrow Keys for Movement and Spacebar to fire.", 20);
        addObject(label4,290,258);
        label4.setLocation(300,255);
        Label label7 = new Label("Mystery Boxes will pop up occassionally to grant special suprises including speed up and faster bullets!", 16);
        addObject(label7,300,314);
    }
}
