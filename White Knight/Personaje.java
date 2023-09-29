import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje extends Actor
{
    private int velocidad;
    private int velX;
    private int velY;
    private int gravedad;
    private int impulso;
    private int frame1,frame2;
   private boolean GolpeBloque;
   private int cont;
   private int daño;
    private int hp, pun, punt;
    private int hpsuport;
   
     
      
      public Personaje(){
          this.velocidad = 0;
          this.punt=0;
          this.velX=4;
          this.velY=2;
          this.gravedad=1;
          this.impulso = -18;
          this.frame1 = 0;
          this.frame2 = 0;
          this.GolpeBloque = false;
          this.cont = 0;
          this.daño = 0;
          this.hp = 12;
          this.hpsuport = 6;
          this.pun = 0;
          
          
          
        }
       
        
            
           
       
      
  //Para mover el personaje
    public void mover(){
        
        
        
        if(Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("d") && Greenfoot.getKey()!="left"){
            frame1++;
            if(frame1>9){
                frame1=1;
            }
            setImage("R"+frame1+".png");
            
           
            setLocation(getX() + velX, getY());
            velX=4;
       
        }if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            frame2++;
            if(frame2>5){
                frame2=1;
            }
            setImage("H"+frame2+".png");
            
            setLocation(getX() + velX, getY());
            velX=-4;
        }
        
        if(Greenfoot.isKeyDown("space") && getY()>=520){
            
            Greenfoot.playSound("salto.mp3");
            
            velocidad = impulso;
            caer();
        }else if(Greenfoot.isKeyDown("space") && EnElSuelo()==true){
             Greenfoot.playSound("salto.mp3");
            
            velocidad = impulso;
            caer();
        }
        AtaqueHeroe(velX);
     
    }
    
    //Función que hacer caer al personaje
    public void caer(){
        
        
        setLocation(getX(), getY()+velocidad);
        velocidad+=gravedad;
    
     if(getY()>=520){
               setLocation(getX(),520);
               
            }
            
            
            
    }
    
    
   
    
   //Función para verificar si está en el suelo
    boolean EnElSuelo(){
        
        int p = getImage().getHeight();
        Actor abajo = getOneObjectAtOffset(0, p/2, Plataformas.class);
        
        return abajo!=null;
        
    }
    //Para saber si esta en la plataforma
    public void CheckCaida(){
        if(!EnElSuelo()){
            caer();
             GolpeBloque = false;
        }
        else{
            velocidad =0;
         GolpeBloque = false;
        }
        
        
    }
    //para saber si golpea el bloque de arriba
    public void GolpeArriba()
    {
        Actor coll = getOneObjectAtOffset(1, -17, Plataformas.class);
        if(coll != null)
        {
            velocidad = 0;
            if(coll instanceof Bloque && !GolpeBloque)
            {
                Bloque actor = (Bloque) coll;
                actor.GolpeDirecto();
                GolpeBloque = true;
            }
        }
    }
    
    //para cruzar oaredes
   public void CruzarParedes()
    {
       
        if(getX() >= getWorld().getWidth()-5)
        {
            setLocation(6,getY());
        }
        else if(getX() <= 5)
        {
           setLocation(getWorld().getWidth()-5, getY()); 
        }
    }
    //funcion para personaje atacar
    public void AtaqueHeroe(int dir){
        
        if(Greenfoot.isKeyDown("f") || Greenfoot.mouseClicked(this.getWorld())){
            if(dir>0){
                
                if(cont == 3)
              {
               setImage("HA0.png");
              }
           if(cont == 6)
              {
               setImage("HA1.png");
              }
           if(cont == 9)
              {
               setImage("HA2.png");
              }
           if(cont == 12)
              {
               setImage("HA3.png");
              }
           if(cont == 15)
             {
               setImage("HA4.png");
              
             }
             if(cont == 18)
             {
               setImage("HA5.png");
              
             }
             if(cont >= 21)
             {
               setImage("HA6.png");
              punto();
               cont=0;
                Greenfoot.playSound("ataque.mp3");
               
             }

        }
        
        if(dir <0)
          {
              
            if(cont == 3)
              {
               setImage("HAA0.png");
              }
           if(cont == 6)
              {
               setImage("HAA1.png");
              }
           if(cont == 9)
              {
               setImage("HAA2.png");
              }
           if(cont == 12)
              {
               setImage("HAA3.png");
              }
           if(cont == 15)
             {
               setImage("HAA4.png");
               
             }
             if(cont == 18)
             {
               setImage("HAA5.png");
              
             }
             if(cont >= 21)
             {
               setImage("HAA6.png");
               punto();
               cont=0;
               Greenfoot.playSound("ataque.mp3");
                
           
             }
             
            }
            
        }
        
    }
    
    public void aumentaDano(){
        daño++;
    } 
    //para saber si el peronaje está vivo
    public boolean EsVivo(int hp) {
        boolean ban=false;
        
        if(daño>=hp) {
            ban = true;
        }
        
        return (ban);
       }
       //funcion para agregar puntos cada vez que muera un enemigo
        public void punto(){
            Actor z, zm;
        Actor N,NL,r,rl;
            N=getOneIntersectingObject(Ninja.class);
            z=getOneIntersectingObject(Zombie.class);
            zm=getOneIntersectingObject(ZombieMujer.class);
            NL=getOneIntersectingObject(NinjaL.class);
            N=getOneIntersectingObject(Ninja.class);
            r=getOneIntersectingObject(Robot.class);
            rl=getOneIntersectingObject(RobotL.class);
     
         
         
         
         if(N!=null){
             getWorld().removeObject(N);
             pun = pun+200;
            }
            if(z!=null) {
                               
                               
                               getWorld().removeObject(z);
                               pun=pun+10;
   
                                 }
         
                if(zm!=null){
                 getWorld().removeObject(zm);
                 pun = pun+10;
                } 
        
             
            if(NL!=null){
             getWorld().removeObject(NL);
             pun = pun+200;
             
            }
            if(r!=null){
             getWorld().removeObject(r);
             pun = pun+500;
             
            }
            if(rl!=null){
             getWorld().removeObject(rl);
             pun = pun+500;
             
            }
       
             if(pun == 150){
                getWorld().removeObjects(getWorld().getObjects(Puerta.class));
                 getWorld().addObject(new PuertaAbierta(), 1110, 75);
             
    }
    if(pun >=500 && pun <2000){
                //getWorld().removeObjects(getWorld().getObjects(Puerta.class));
                getWorld().removeObjects(getWorld().getObjects(PuertaAbierta.class));
                 getWorld().addObject(new PuertaAbierta2(), 40, 80);
            
             
    }
    if(pun>=2000){
        //getWorld().removeObjects(getWorld().getObjects(Puerta.class));
                getWorld().removeObjects(getWorld().getObjects(PuertaAbierta2.class));
                 getWorld().addObject(new PuertaAbierta3(), 1110, 80);
        
    }
    
            this.getWorld().showText("Puntos: "+ pun, 580,40);
        }
      
        
       public void CambiarEscenario1(){
          
           Actor a;
           a=getOneIntersectingObject(PuertaAbierta.class);
          

           if(a!=null){
                 Greenfoot.setWorld(new Escenario2());
                }   
           
        }
        public void CambiarEscenario2(){
            
           Actor a;
           a=getOneIntersectingObject(PuertaAbierta2.class);
          

           if(a!=null){
                 Greenfoot.setWorld(new Escenario3());
                }   
           
        }
        public void Ganar(){
            
           Actor a;
           a=getOneIntersectingObject(PuertaAbierta3.class);
          

           if(a!=null){
                 Greenfoot.setWorld(new Ganar());
                }   
           
        }
      
        
       
        
       
    
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
      List L1;
      Vida vid;
     
      
      
        
       CheckCaida();
      GolpeArriba();
        mover();
        cont++;
       CruzarParedes();
       CambiarEscenario1();
       CambiarEscenario2();
       Ganar();
       
       //para ir quitando vida al personaje
        if(EsVivo(hpsuport)){
          hp--;
          daño=0;
           L1=getWorld().getObjects(Vida.class);
                 vid=(Vida)L1.get(0);
                 vid.restar();
        } 
        if(hp==0) {
            Greenfoot.setWorld(new GameOver());
           
            
            
        }
         
            
      
        
      
        
        // Add your actmion code here.
    }    
}

