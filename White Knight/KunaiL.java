import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KunaiL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KunaiL extends Ninjas
{
    /**
     * Act - do whatever the KunaiL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-3, getY());
        dano();
        RemoverKunai();
        // Add your action code here.
    }    
    public void dano(){
        Actor ac;
    ac=getOneIntersectingObject(Personaje.class);
        
        if(ac!=null) {
                ((Personaje)ac).aumentaDano();
                //((Vidas)ac).cambiaImagen();
                
            }
}
public void RemoverKunai(){
    if(getX()>=1110 || getX()<=2){
        getWorld().removeObject(this);
        }
}
}
