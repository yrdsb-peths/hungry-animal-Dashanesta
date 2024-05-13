import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Shane DG
 * @version May 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    public int lives = 3;
    Label livesLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create labels
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        livesLabel = new Label("Lives: 3", 50);
        addObject(livesLabel, 500, 30);
        
        createApple();
        createSpider();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
        Greenfoot.stop();
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if((level*score - score) % 30 == 0)
        {
            level++;
        }
    }
    
    /**
     * Decrease score
     */
    public void decreaseScore()
    {
        if(score>0)
        {
            score--;            
        }
        scoreLabel.setValue(score);
    }
    
    /**
     * Lose a life
     */
    public void lostLife()
    {
        lives--;
        livesLabel.setValue("Lives: " + lives);
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    /**
     * Create a new spider at random location at top of screen
     */
    public void createSpider()
    {
        Spider spider = new Spider();
        spider.setSpeed((level+1)/2);
        int x = Greenfoot.getRandomNumber(600);
        int y = -25;
        addObject(spider, x, y);
    }
}
