import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * बहुत महाकाव्य
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,269,285);
        worm worm = new worm();
        addObject(worm,53,76);
        worm worm2 = new worm();
        addObject(worm2,307,160);
        worm worm3 = new worm();
        addObject(worm3,416,29);
        worm worm4 = new worm();
        addObject(worm4,350,260);
        worm worm5 = new worm();
        addObject(worm5,500,350);
        worm worm6 = new worm();
        addObject(worm6,272,426);
        worm worm7 = new worm();
        addObject(worm7,124,204);
        worm worm8 = new worm();
        addObject(worm8,125,371);
        Lobster lobster = new Lobster();
        addObject(lobster,37,282);
    }
}