import greenfoot.*;

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse GameOver.
 * 
 * @author Jan Allewelt
 * @version 1
 */

public class Bar extends Actor
{
    // Bar definieren
    private int count = 0;
    public Bar() 
    { 
        updateImage();
    } 
    public void bumpCount(int amount) 
    { 
        count += amount; 
        updateImage();
    }
    public int getCounter()
    {
        return count;
    }
    private void updateImage()
    {
        setImage(new GreenfootImage("    " +count + " Points   ", 50, Color.WHITE, Color.BLACK)); 
    }
}

