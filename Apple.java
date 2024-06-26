import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Shane DG
 * @version May 2024
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Apple falls
        setLocation(getX(), getY() + speed);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.lostLife();
            world.removeObject(this);
            world.createApple();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
