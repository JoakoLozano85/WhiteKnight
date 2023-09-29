import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal extends Mundo
{
    GreenfootSound sonido = new GreenfootSound("intro.mp3");
    /**
     * Constructor for objects of class Principal.
     * 
     */
    public Principal()
    {
        //adicionar botones
       addObject(new BotonPlay(), 500, 300);
       addObject(new BotonCreditos(), 600, 400);
       addObject(new BotonControles(), 700, 500);
       sonido.play();
       if(Greenfoot.mouseClicked(BotonPlay.class)){
           sonido.stop();
        }
        
    }
    public void act(){
        
        
    }
    
    
}
