import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Robots
{
    private int cont;
    
    public Robot(){
     this.cont=0;   
        
    }
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        cont++;
        mover();
        // Add your action code here.
    }  
    
    public void mover(){
         List L;
        L = this.getObjectsInRange(450,Personaje.class);
        Personaje per = new Personaje();
       
        
            
        if(cont==20){
            setImage("E1.png");
        }
         if(cont==40){
            setImage("E2.png");
        }
         if(cont==60){
            setImage("E3.png");
        }
         if(cont==80){
            setImage("E4.png");
        }
         if(cont==100){
            setImage("E5.png");
             if(!L.isEmpty()){
            getWorld().addObject(new Bala(), getX()+10, getY());
             Greenfoot.playSound("robot.mp3");
        }
        cont=0;
        }
        
        
    
    }
}
