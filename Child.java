import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.*;
import java.util.*;

/**
 * Write a description of class Child here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Child extends Actor
{
    boolean spawnRightSide = true;
    World world = getWorld();
    
    
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
