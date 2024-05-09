import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Shane DG
 * @version May 2024
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label titleLabel = new Label("Hungry Elephant", 80);
        addObject(titleLabel, getWidth()/2, 200);
        Label label = new Label("Press \u2190 and \u2192 to move", 40);
        addObject(label,getWidth()/2,270);
        Label label2 = new Label("Press \u2423 to start!", 40);
        addObject(label2,getWidth()/2,320);
        Elephant elephant = new Elephant();
        addObject(elephant,450,95);
        Elephant elephant2 = new Elephant();
        addObject(elephant2,150,95);
    }
}
