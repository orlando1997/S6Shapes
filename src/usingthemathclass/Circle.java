/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usingthemathclass;

/**
 *
 * @author jonathanmolson
 */
public class Circle 
{
    double radius;
    double pi = Math.PI;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public void calcCirc()
    {
        double cc = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + cc);
    }
    
    public void calcArea()
    {
        double ca = pi * Math.pow(radius,2);
        System.out.println("The area of the circle is " + ca);
    }
}
