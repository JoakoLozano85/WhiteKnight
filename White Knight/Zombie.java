import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    
   private int velocidadZ =  0;
   private int gravedadZ = 1;
    
   private int cont;
   private int rand;
   private int direccion;
   
   Vida vid;
   
   public Zombie()
    {
        cont=0;
        direccion =0;    
        rand=0;
    }
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();
        cont++;
        CheckCaidaZ();
        //CruzarParedesZ();
        // Add your action code here.
    }  
    //para verificar si está en el suelo
     boolean EnElSueloZ(){
        
        int p = getImage().getHeight();
        Actor abajo = getOneObjectAtOffset(0, p/2, Plataformas.class);
        
        return abajo!=null;
        
    }
    //para hacer caer al personaje
    public void caerZ(){
        
        
        setLocation(getX(), getY()+velocidadZ);
        velocidadZ+=gravedadZ;
    
     if(getY()>=520){
               setLocation(getX(),520);
               
            }
            
            
            
    }
    //para verificar si se ha caido
    public void CheckCaidaZ(){
        if(!EnElSueloZ()){
            caerZ();
             
        }
        else{
            velocidadZ =0;
         
        }
        
        
    }
    //para mover al personaje
    public void mover(){
        List L;
        List L1;
        Personaje heroe;
        
        L = this.getObjectsInRange(800,Personaje.class);
        L1= this.getObjectsInRange(80,Personaje.class);
        
        if(!L.isEmpty())
             {
                 heroe = (Personaje)L.get(0);
                 
                 if(heroe.getX()<getX())
                 {
                   direccion=0;
                   caminar(direccion,getX(),getY());
                   setLocation(getX()-1,getY());
                 }
               
                    if(heroe.getX()>getX())
                    {
                    direccion=1;
                    caminar(direccion,getX(),getY());
                    setLocation(getX()+1,getY());
                    }
                       if(heroe.getY()<getY()){
                       caminar(direccion,getX(),getY());
                       setLocation(getX(),getY()-1);
                      }
                       if(heroe.getY()>getY()){
                        caminar(direccion,getX(),getY());
                        setLocation(getX(),getY()+5);
                       }
                        if(heroe.getX()>getX()&&heroe.getY()>getY()){ 
                        caminar(direccion,getX(),getY());
                        setLocation(getX()+1,getY()+5);}
                        
                        if(heroe.getX()>getX()&&heroe.getY()<getY()){ 
                        caminar(direccion,getX(),getY());
                        setLocation(getX()+1,getY()-1);}
                        
                        if(heroe.getX()<getX()&&heroe.getY()>getY()){ 
                        caminar(direccion,getX(),getY());
                        setLocation(getX()-1,getY()+5);}
                        
                        if(heroe.getX()<getX()&&heroe.getY()<getY()){ 
                        caminar(direccion,getX(),getY());
                        setLocation(getX()-1,getY()-1);}
                        
                       if(!L1.isEmpty()){
                           
                           AtaqueZombie(direccion);
                           
                        }
                    
                       
                        
             }
                else
             {
                 
        if(rand==0)
        {
           direccion=0;
           caminar(direccion,getX(),getY());
           setLocation(getX()-1,getY());
        }
        else
            if(rand==1)
            {
                direccion=1;
                caminar(direccion,getX(),getY());
                setLocation(getX()+1,getY());
            }
             if(rand==2&&getY()>=120)
             {
             caminar(direccion,getX(),getY());
             setLocation(getX(),getY()-1);
             }
             else
               if(rand==3)
              {
                caminar(direccion,getX(),getY());
                setLocation(getX(),getY()+5);
              }
              else
                 rand=Greenfoot.getRandomNumber(4);
        }
        
    }
    //para la animacion del personaje
    public void caminar(int dire,int x,int y)
{
            Actor p;
            p=getOneIntersectingObject(Personaje.class);

        if(dire==1)
          {

            if(cont == 5)
              {
               setImage("Z1.png");
              }
           if(cont == 10)
              {
               setImage("Z2.png");
              }
           if(cont == 15)
              {
               setImage("Z3.png");
              }
           if(cont == 20)
              {
               setImage("Z4.png");
              }
           if(cont == 25)
             {
               setImage("Z5.png");
             }
           if(cont == 30)
             {
              setImage("Z6.png");
             }       
           if(cont >= 35)
             {
              setImage("Z7.png"); 
              cont = 0;
              if(p!=null) {
                               ((Personaje)p).aumentaDano();
                               Greenfoot.playSound("zombie.mp3");
                                 }
                  
             rand=Greenfoot.getRandomNumber(4);
             }
        }
        
        if(dire==0)
          {

            if(cont == 5)
              {
               setImage("ZZ1.png");
              }
           if(cont == 10)
              {
               setImage("ZZ2.png");
              }
           if(cont == 15)
              {
               setImage("ZZ3.png");
              }
           if(cont == 20)
              {
               setImage("ZZ4.png");
              }
           if(cont == 25)
             {
               setImage("ZZ5.png");
             }
           if(cont == 30)
             {
              setImage("ZZ6.png");
             }       
           if(cont >= 35)
             {
              setImage("ZZ7.png");
              cont = 0;
                         if(p!=null) {
                               ((Personaje)p).aumentaDano();
                               Greenfoot.playSound("zombie.mp3");
                                 }       
              rand=Greenfoot.getRandomNumber(4);
              
             }
             
        }
      
  }
   //para que ataque el zombie
     public void AtaqueZombie(int dire){
      
        Actor p;
        
        p = getOneIntersectingObject(Personaje.class);
      
      if(dire==0)
          {

            if(cont == 7)
              {
               setImage("AZZ1.png");
              }
           if(cont == 14)
              {
               setImage("AZZ2.png");
              }
           if(cont == 21)
              {
               setImage("AZZ3.png");
              }
           if(cont == 28)
              {
               setImage("AZZ4.png");
              }
           if(cont >= 35)
             {
               setImage("AZZ5.png");
              
               cont=0;
             }

        }
        
        if(dire==1)
          {

            if(cont == 7)
              {
               setImage("AZ1.png");
              }
           if(cont == 14)
              {
               setImage("AZ2.png");
              }
           if(cont == 21)
              {
               setImage("AZ3.png");
              }
           if(cont == 28)
              {
               setImage("AZ4.png");
              }
           if(cont >= 35)
             {
               setImage("AZ5.png");
               
               //Greenfoot.playSound("mordida.mp3");
               cont=0;
             }
    
        }
      
    }
   
}
