import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When a spider is eaten, score is decremented.
 * 
 * @author Shane DG
 * @version May 2024
 */
public class Spider extends Actor
{
    int speed = 1;
    int delay = 100;
    public void act()
    {
        if (delay > 0) {
            delay--;
            return;
        }
        // Spider falls
        setLocation(getX(), getY() + speed);
        
        // Remove spider and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createSpider();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    public void setDelay(int loops)
    {
        delay = loops;
    }
}
