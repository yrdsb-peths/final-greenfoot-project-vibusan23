import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Alien only used in the background as an image 
 * 
 * @author (Vibusan Anandarajah) 
 * @version (January 18, 2023)
 */
public class AlienForBackGround extends Actor
{
    /**
     * The code below allows for the image to be made purely for the background
     */
    public AlienForBackGround()
    {
        GreenfootImage image = getImage();
        image.scale(150,150);
        setImage(image);
    }
}
