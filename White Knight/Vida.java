import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    private int vida;
    
    public Vida(){
     this.vida = 12;   
    }
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        // Add your action code here.
    } 
    
    public void restar()
    {
        
        vida--;
        if(vida>0)
        {
        setImage("V"+vida+".png");
        }
    }
}
