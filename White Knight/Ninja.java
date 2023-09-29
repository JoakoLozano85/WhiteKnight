import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Ninjas
{
    private int cont;
    
    public Ninja(){
        
     cont = 0;   
    }
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {
        mover();
        cont++;
        // Add your action code here.
    } 
    //para el ninja lanzar el kunai
    public void mover(){
         List L;
        L = this.getObjectsInRange(450,Personaje.class);
        Personaje per = new Personaje();
       
        
            
        if(cont==20){
            setImage("N1.png");
        }
         if(cont==40){
            setImage("N2.png");
        }
         if(cont==60){
            setImage("N3.png");
        }
         if(cont==80){
            setImage("N4.png");
        }
         if(cont==100){
            setImage("N5.png");
        }
         if(cont==120){
            setImage("N6.png");
        }
         if(cont==140){
            setImage("N7.png");
        }
         if(cont==160){
            setImage("N8.png");
             if(!L.isEmpty()){
            getWorld().addObject(new Kunai(), getX()+4, getY());
            Greenfoot.playSound("ninja.mp3");
        }
        
        cont=0;
            
        }
    
    }
}
