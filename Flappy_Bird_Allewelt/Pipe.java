import greenfoot.*;

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse GameOver.
 * 
 * @author Jan Allewelt
 * @version 1
 */

public class Pipe extends Actor
{
    public Pipe()
    {
       GreenfootImage image = getImage();
       image.scale(500,900);
    }
    public void act() 
    {
        setLocation(getX()-1, getY());
        if(getX() <= 1)
        {
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
    
        } 
        MyWorld myWorld = (MyWorld)getWorld();
        if(myWorld.getBar().getCounter() > 15){
            GreenfootImage hardImage = new GreenfootImage("pipe - hard.png");
            hardImage.scale(500, 900);
            setImage(hardImage);
            setLocation(getX()-2, getY());
        }
    }
}
