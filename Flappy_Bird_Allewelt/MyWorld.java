import greenfoot.*;

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse GameOver.
 * 
 * @author Jan Allewelt
 * @version 1
 */

public class MyWorld extends World
{
    Bar bar;
    public MyWorld()
    {    
        super(600, 400, 1); 
        bar = new Bar();
        addObject(new FlappyBird(), 100, 200);
        addObject(new Pipe(), 300, 150);
        addObject(new Pipe(), 600, 150);
        addObject(bar, 95,20);
    }
    public Bar getBar(){
        return bar;
    }
    public void act(){
        if(bar.getCounter() > 25){
            GreenfootImage imageHard = new GreenfootImage("background - hard.jpg");
            setBackground(imageHard);
        }
    }
}
