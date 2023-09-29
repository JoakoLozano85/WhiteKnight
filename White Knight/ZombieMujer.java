import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ZombieMujer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieMujer extends Actor
{
    private int velocidadZ =  0;
   private int gravedadZ = 1;
    
   private int cont;
   private int rand;
   private int direccion;
   
   Vida vid;
   public ZombieMujer(){
       
       cont=0;
        direccion =0;    
        rand=0;
    }
    public void act() 
    {
        mover();
        cont++;
        CheckCaidaZ();
    } 
    
     boolean EnElSueloZ(){
        
        int p = getImage().getHeight();
        Actor abajo = getOneObjectAtOffset(0, p/2, Plataformas.class);
        
        return abajo!=null;
        
    }
    public void caerZ(){
        
        
        setLocation(getX(), getY()+velocidadZ);
        velocidadZ+=gravedadZ;
    
     if(getY()>=520){
               setLocation(getX(),520);
               
            }
            
            
            
    }
     public void CheckCaidaZ(){
        if(!EnElSueloZ()){
            caerZ();
             
        }
        else{
            velocidadZ =0;
         
        }
        
        
    }
    
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
    public void caminar(int dire,int x,int y)
{
            Actor p;
            p=getOneIntersectingObject(Personaje.class);

        if(dire==1)
          {

            if(cont == 5)
              {
               setImage("L1.png");
              }
           if(cont == 10)
              {
               setImage("L2.png");
              }
           if(cont == 15)
              {
               setImage("L3.png");
              }
           if(cont == 20)
              {
               setImage("L4.png");
              }
           if(cont == 25)
             {
               setImage("L5.png");
             }
           if(cont == 30)
             {
              setImage("L6.png");
             }       
           if(cont >= 35)
             {
              setImage("L7.png"); 
              cont = 0;
              if(p!=null) {
                               ((Personaje)p).aumentaDano();
                                 }
                  
             rand=Greenfoot.getRandomNumber(4);
             }
        }
        
        if(dire==0)
          {

            if(cont == 5)
              {
               setImage("LL1.png");
              }
           if(cont == 10)
              {
               setImage("LL2.png");
              }
           if(cont == 15)
              {
               setImage("LL3.png");
              }
           if(cont == 20)
              {
               setImage("LL4.png");
              }
           if(cont == 25)
             {
               setImage("LL5.png");
             }
           if(cont == 30)
             {
              setImage("LL6.png");
             }       
           if(cont >= 35)
             {
              setImage("LL7.png");
              cont = 0;
                         if(p!=null) {
                               ((Personaje)p).aumentaDano();
                                 }       
              rand=Greenfoot.getRandomNumber(4);
             }
        }
      
  }
  public void AtaqueZombie(int dire){
      
        Actor p;
        
        p = getOneIntersectingObject(Personaje.class);
      
      if(dire==0)
          {

            if(cont == 7)
              {
               setImage("LMM1.png");
              }
           if(cont == 14)
              {
               setImage("LMM2.png");
              }
           if(cont == 21)
              {
               setImage("LMM3.png");
              }
           if(cont == 28)
              {
               setImage("LMM4.png");
              }
           if(cont >= 35)
             {
               setImage("LMM5.png");
              
               cont=0;
             }

        }
        
        if(dire==1)
          {

            if(cont == 7)
              {
               setImage("LM1.png");
              }
           if(cont == 14)
              {
               setImage("LM2.png");
              }
           if(cont == 21)
              {
               setImage("LM3.png");
              }
           if(cont == 28)
              {
               setImage("LM4.png");
              }
           if(cont >= 35)
             {
               setImage("LM5.png");
           
               cont=0;
             }
    
        }
      
    }
    
    
}
