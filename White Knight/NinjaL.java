import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class NinjaL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaL extends Ninjas
{
    private int cont;
    
    public NinjaL(){
        
        this.cont=0;
    }
    /**
     * Act - do whatever the NinjaL wants to do. This method is called whenever
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
            setImage("NN1.png");
        }
         if(cont==40){
            setImage("NN2.png");
        }
         if(cont==60){
            setImage("NN3.png");
        }
         if(cont==80){
            setImage("NN4.png");
        }
         if(cont==100){
            setImage("NN5.png");
        }
         if(cont==120){
            setImage("NN6.png");
        }
         if(cont==140){
            setImage("NN7.png");
        }
         if(cont==180){
            setImage("NN8.png");
             if(!L.isEmpty()){
            getWorld().addObject(new KunaiL(), getX(), getY());
            Greenfoot.playSound("ninja.mp3");
        }
        
        cont=0;
            
        }
    
    }
}
