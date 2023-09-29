import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario3 extends Mundo
{
    private Bloque bloques1[] = new Bloque[36];
    private Bloque bloques2[] = new Bloque[8];
    private Bloque bloques3[] = new Bloque[8];
    private Bloque bloques4[] = new Bloque[24];
    private Bloque bloques5[] = new Bloque[24];
    private Bloque bloques6[] = new Bloque[24];
    private Bloque bloques7[] = new Bloque[24];
    private int pun =0;

    /**
     * Constructor for objects of class Escenario3.
     * 
     */
    public Escenario3()
    {
        this.addObject(new Personaje(), 550, 520);
        this.addObject(new Vida(), 1000, 130);
        this.addObject(new Corazon(), 840, 15);
        addObject(new Zombie(), 60, 60);
        addObject(new Puerta(), 1110, 80);
        addObject(new Puerta(), 40, 80);
        addObject(new ZombieMujer(), 1100, 60);
        addObject(new Robot(), 250, 200);
        addObject(new Ninja(), 20, 520);
        addObject(new RobotL(), 1100, 405);
        addObject(new RobotL(), 1000, 75);
        addObject(new Ninja(), 100, 70);
        addObject(new NinjaL(), 1100, 520);
        CrearBloques();
    }
    
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
     public void Zombie(){
        int random = Greenfoot.getRandomNumber(300);

        if(random == 10)
        {
            addObject(new Zombie(), 60, 60);
        }
        
    }
    public void ZombieMujer(){
        int random = Greenfoot.getRandomNumber(200);

        if(random == 10)
        {
            addObject(new ZombieMujer(), 1100, 60);
        }
        
    }
    public void act(){
        
        Zombie();
        ZombieMujer();
    }
}
