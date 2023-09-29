import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonInicio extends Menu
{
    GreenfootSound sonido = new GreenfootSound("boton.mp3");
    /**
     * Act - do whatever the BotonInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sonido.play();
            Greenfoot.setWorld(new Principal());
        }
        
        // Add your action code here.
    }    
}
