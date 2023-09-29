import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario1 extends Mundo
{
    private Personaje heroe;
    private Vida V100;
    private Corazon cor;
    private Principal pr = new Principal();
    private Bloque bloques1[] = new Bloque[36];
    private Bloque bloques2[] = new Bloque[8];
    private Bloque bloques3[] = new Bloque[8];
    private Bloque bloques4[] = new Bloque[24];
    private Bloque bloques5[] = new Bloque[24];
    private Bloque bloques6[] = new Bloque[24];
    private Bloque bloques7[] = new Bloque[24];
    
    

    /**
     * Constructor for objects of class Escenario1.
     * 
     */
    public Escenario1()
    {
        
        this.heroe = new Personaje();
       this.V100 = new Vida();
       this.cor = new Corazon();
        this.addObject(this.heroe, 550, 520);
        this.addObject(this.V100, 1000, 130);
        this.addObject(this.cor, 840, 15);
        CrearBloques();
        addObject(new Zombie(), 60, 60);
        addObject(new ZombieMujer(), 1100, 60);
        addObject(new Puerta(), 1110, 80);
      
    }
    //creando bloques
    public void CrearBloques()
    {
        
        int x = 230;
        for(int i = 0; i < 36; i++)
        {
            bloques1[i] = new Bloque();
            addObject(bloques1[i], x, 250);
            x+=20;
        }
        
        int x2 = 8;
        for(int i = 0; i< 8; i++)
        {
            bloques2[i] = new Bloque();
            addObject(bloques2[i], x2, 350);
            x2+=20;
        }

        int x3 = getWidth() - 150;
        for(int i = 0; i < 8; i++)
        {
            bloques3[i] = new Bloque();
            addObject(bloques3[i], x3, 350);
            x3+=20;
        }

        int x4 = 8;
        for(int i = 0; i < 24; i++)
        {
            bloques4[i] = new Bloque();
            addObject(bloques4[i], x4, 450);
            x4+=20;
        }

        int x5 = getWidth() - 470;
        for(int i = 0; i<24; i++)
        {
            bloques5[i] = new Bloque();
            addObject(bloques5[i], x5, 450);
            x5+=20;
        }
        
         int x6 = 8;
        for(int i = 0; i < 24; i++)
        {
            bloques6[i] = new Bloque();
            addObject(bloques6[i], x6, 120);
            x6+=20;
        }

        int x7 = getWidth() - 470;
        for(int i = 0; i<24; i++)
        {
            bloques7[i] = new Bloque();
            addObject(bloques7[i], x7, 120);
            x7+=20;
        }

    }
    //para aparecer zombies aleatorio
    public void Zombie(){
        int random = Greenfoot.getRandomNumber(300);

        if(random == 10)
        {
            addObject(new Zombie(), 60, 60);
        }
        
    }
    //para aparecer zombies aleatorio
    public void ZombieMujer(){
        int random = Greenfoot.getRandomNumber(200);

        if(random == 10)
        {
            addObject(new ZombieMujer(), 1100, 60);
        }
        
    }
   public void act()
    {
        Zombie();
        ZombieMujer();
    }
}
