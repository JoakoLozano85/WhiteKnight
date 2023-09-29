import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class RobotL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotL extends Robots
{
    private int cont;
    
    public RobotL(){
     this.cont=0;   
    }
    /**
     * Act - do whatever the RobotL wants to do. This method is called whenever
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
            setImage("EE1.png");
        }
         if(cont==40){
            setImage("EE2.png");
        }
         if(cont==60){
            setImage("EE3.png");
        }
         if(cont==80){
            setImage("EE4.png");
        }
         if(cont==100){
            setImage("EE5.png");
             if(!L.isEmpty()){
            getWorld().addObject(new BalaL(), getX(), getY());
             Greenfoot.playSound("robot.mp3");
        }
        
        cont=0;
        }
      
    
    }
}
