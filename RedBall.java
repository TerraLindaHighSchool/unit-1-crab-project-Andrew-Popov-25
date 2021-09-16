import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.*;

/**
 * The main actor: RedBall
 * 
 * @Andrew Popov
 * @09/09 03:13pm
 */
public class RedBall extends Actor
{
    float acceleration = 1.5f;
    float vSpeed = 2;
    int speed = 15;
    int jumpStrenght = 20;
    float bounces = 1.0f;
    private Child child = new Child();
    
    /**
     * Act - do whatever the RedBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Fall();
        checkKeys();
        checkFall();
        checkChild();
    }
    public boolean onGround()
    {
        if(isTouching(Ground.class)){
            return true;
        } else {
            return false;
        } 
    }
    public void Fall()
    {
     setLocation (getX(), getY() + Math.round(vSpeed));
     vSpeed = vSpeed += acceleration;
    }
    public void Bounce()
    {
        vSpeed = -30/bounces;
        setLocation (getX(), getY() + 50);
        Fall();
        bounces = bounces + 0.2f;
    }
    public void checkFall()
    {
        if (onGround())
        {
            Bounce();
        } else {
            Fall();
        }
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")  && onGround() == false)
        {
         moveLeft();
        }
        if(Greenfoot.isKeyDown("right") && onGround() == false)
        {
          moveRight(); 
        }
        if (Greenfoot.isKeyDown("up") && onGround())
        {
          jump(); 
        }
    }
    public void jump()
    {
        bounces = 1;
        setLocation(getX(), getY() + 5);
        vSpeed = -jumpStrenght;
        Fall();
    }
    public void moveLeft()
    {
          setLocation(getX() - speed, getY());  
    }
      public void moveRight()
    {
      setLocation(getX() + speed, getY());  
    }
    public void checkChild()
    {
        if(isTouching(Child.class))
        {
            if(isTouching(Ground.class))
            {
                removeTouching(Child.class);
                Greenfoot.stop();
                WinSplash loss = new WinSplash();
                Greenfoot.setWorld(loss);
            } else {
                removeTouching(Child.class);
                child = new Child();
                child.setWorld(getWorld());
                child.SpawnRand();
            }
        }
    }
}
