import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Andrew Popov
 * @version 08/26/2021
 */
public class Crab extends Actor
{
    //This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    //Moves The Crab
    
    //Turns the Crab at the edge
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    //Ckeck for user key presses so user can turn the Crab
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }
    
    //Check for collisions with other objects
    public void onCollision()
    {
        if(isTouching(worm.class))
        {
            removeTouching(worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
}