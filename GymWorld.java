import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class GymWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public GymWorld() 
    {
        super(900, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * बहुत महाकाव्य
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,450,605);
        RedBall redBall = new RedBall();
        addObject(redBall,150,309);
        Child child = new Child();
        addObject(child,5,580);
        Child child2 = new Child();
        addObject(child2,890,581);
    }
}