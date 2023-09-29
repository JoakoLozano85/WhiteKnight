import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kunai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kunai extends Ninjas
{
    /**
     * Act - do whatever the Kunai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+3, getY());
        dano();
        RemoverKunai();
        // Add your action code here.
    } 
    //para hacer daño al personaje
     public void dano(){
        Actor ac;
    ac=getOneIntersectingObject(Personaje.class);
        
        if(ac!=null) {
                ((Personaje)ac).aumentaDano();
                //((Vidas)ac).cambiaImagen();
                
            }
}
//removiendo el kunai del mapa
public void RemoverKunai(){
    if(getX()>=1110 || getX()<=2){
        getWorld().removeObject(this);
        }
}
}
