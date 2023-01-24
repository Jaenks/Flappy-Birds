import greenfoot.*;

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse GameOver.
 * 
 * @author Jan Allewelt
 * @version 1
 */

public class FlappyBird extends Actor
{
    private double a = 1;
    private int b = 200;
    private int scoreCountDown = 60;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    public FlappyBird()
    {
       GreenfootImage image = getImage();
       image.scale(50,40);
    }
    public void act() 
    {
          if(scoreCountDown > 0){
                  scoreCountDown--;
          }else{
            scoreCountDown = 60;
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.getBar().bumpCount(1);
          }
          if(spacePressed())
          {
            a=-2;
          }
          a+=0.1;
          b+=a;
          setLocation(getX(), (int)(b));          
          if(isTouchPipe())
          {
            isalive = false;   
          }
          if(!isalive)
          {
            getWorld().removeObject(this); 
            Greenfoot.setWorld(new GameOver());
          }      
    }    
    public boolean spacePressed()
    {
          boolean pressed = false;
          if(Greenfoot.isKeyDown("Space"))
          {
          if(!haspressed)
          {
             pressed = true;
          }
          haspressed = true;
          }
          else
          {
             haspressed = false;
          }
          return pressed;
    }
    public boolean isTouchPipe()
    {
          isacross = false;
          for(Pipe pipe : getWorld().getObjects(Pipe.class))
          {
             if(Math.abs(pipe.getX() - getX()) < 69)
             {
                if(Math.abs(pipe.getY() + 30 - getY()) > 37)
                {
                    isalive = false;
                }
                isacross = true;
             } 
          }
          return !isalive;
    }
}
