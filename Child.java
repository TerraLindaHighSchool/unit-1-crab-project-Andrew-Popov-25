import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.*;
import java.util.*;

/**
 * Runs around and tries to steal the ball
 * 
 * @Andrew Popov
 * @09/15/21
 */
public class Child extends Actor
{
    boolean spawnRightSide = true;
    World world = getWorld();
    
    //Setting the world: this is done because greenfoot doesn't like me
    public void setWorld(World world) {
        this.world = world;
    }
    /**
     * Act - do whatever the Child wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        WalkToBall();
    }
    
    //Moves in the direction of the ball
    public void WalkToBall()
    {
        List players = getWorld().getObjects(RedBall.class);
        Actor player = (Actor)players.get(0);
        if(player.getX() > getX())
        {
            setLocation(getX() + 5, getY());
        } else {
            setLocation(getX() - 5, getY());
        }
    }
    
    //Chooses a side to respawn on
    public void SpawnRand()
    {
        spawnRightSide = (Math.random() < 0.5);
        if(spawnRightSide)
        {
            world.addObject(this, 0, 580);
        } else {
            world.addObject(this,900, 580);
        }
    }
}
