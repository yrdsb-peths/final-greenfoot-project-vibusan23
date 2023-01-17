import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is soley for the TitleScreen Class.
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class PlaneForBackGround extends Actor
{
    /**
     * Act - do whatever the PlaneForBackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlaneForBackGround()
    {
        GreenfootImage image = getImage();
        image.scale(185,185);
        setImage(image);
    }
    
}
