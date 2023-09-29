import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Robots
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+3, getY());
        dano();
        RemoverBala();
        // Add your action code here.
    }  
    
    public void dano(){
        Actor ac;
    ac=getOneIntersectingObject(Personaje.class);
        
        if(ac!=null) {
                ((Personaje)ac).aumentaDano();
              
                
            }
}
public void RemoverBala(){
    if(getX()>=1110 || getX()<=2){
        getWorld().removeObject(this);
        }
}
}
