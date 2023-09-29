import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bloque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bloque extends Plataformas
{
    
    private static int tiem;
    private boolean normal = true;
    private boolean directo = false;
    private final int temporizador = 1100;
    
    
    public boolean normal()
    {
        return normal;
    }
    
    private void tiempo()
    {
        if(tiem == 0)
        {            
            setImage("bloque.png"); 
            ResetUbicacion();
            normal = true;
        }
        else
            tiem--;
    }
    //hace que los bloques a la derecha y a la izquierda se inclinen hacia arriba
    public void ActivarOtros()
    {
        Bloque toLeft = (Bloque)getOneObjectAtOffset(20, 0, Bloque.class);
        if(toLeft != null)
            toLeft.GolpeIzquierdo();
        

        Bloque toRight = (Bloque)getOneObjectAtOffset(-20, 0, Bloque.class);
        if(toRight != null)
            toRight.GolpeDerecho();
       
    }
    
    public void GolpeDirecto()
    {
        tiem = temporizador;
        normal = false;
        directo = true;
        ActivarOtros();
        setLocation(getX(), getY() - 20);

        setImage("curva.png");
    }
    
    public void GolpeIzquierdo()
    {
        tiem = temporizador;
        normal = false;
        directo = false;
        setLocation(getX(), getY() - 16);
        setImage("bloque0.png");
    }
    
    public void GolpeDerecho()
    {
        tiem = temporizador;
        normal = false;
        directo = false;
        setLocation(getX(), getY() - 16);
        setImage("bloque1.png");
    }
    private void ResetUbicacion()
    {
        if(!normal && directo)
        {
            setLocation(getX(), getY() + 20);
        }
        else if(!normal && !directo)
        setLocation(getX(), getY() + 16);
    }
    /**
     * Act - do whatever the Bloque wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tiempo();
        // Add your action code here.
    }    
}
