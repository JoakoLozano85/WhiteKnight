import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganar extends Mundo
{
    GreenfootSound sonido = new GreenfootSound("ganar.mp3");
    /**
     * Constructor for objects of class Ganar.
     * 
     */
    public Ganar()
    {
        addObject(new BotonInicio(), 770, 500);
        sonido.play();
    }
}
