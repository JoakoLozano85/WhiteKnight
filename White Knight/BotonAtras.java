import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonAtras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonAtras extends Menu
{
    GreenfootSound sonido = new GreenfootSound("boton.mp3");
   
    /**
     * Act - do whatever the BotonAtras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Dar click en el boton
        if(Greenfoot.mouseClicked(this)){
            sonido.play();
         Greenfoot.setWorld(new Principal()); 
         
        }
        
    }    
}
