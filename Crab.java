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
            //bruh
        }
    }
    
    //Ckeck for user key presses so user can turn the Crab
    public void checkKeyPress()
    {
         if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+5);
        }
    }
    
    //Check for collisions with other objects
    public void onCollision()
    {
        if(isTouching(worm.class))
        {
            removeTouching(worm.class);
            Greenfoot.playSound("slurp.wav");
            System.out.println("Number of worms: " + getWorld().getObjects(worm.class).size());
            if(getWorld().getObjects(worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}