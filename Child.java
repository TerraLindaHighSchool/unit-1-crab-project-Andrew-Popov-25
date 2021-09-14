import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.*;
/**
 * Write a description of class Child here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Child extends Actor
{
    boolean spawnRightSide = true;
    World world=getWorld();

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
