import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonPlay extends Menu
{
    GreenfootSound sonido = new GreenfootSound("boton.mp3");
    
    /**
     * Act - do whatever the BotonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //click en el booton para cambiar de mundo
         if(Greenfoot.mouseClicked(this)){
             sonido.play();
            Greenfoot.setWorld(new Escenario1());
            
        }
        
    }    
}
