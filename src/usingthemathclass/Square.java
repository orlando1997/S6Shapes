/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usingthemathclass;

/**
 *
 * @author jonathanmolson
 */
public class Square 
{
    double length;
    
    public Square(double l)
    {
        length = l;
    }
    
    public void calcPerimeter()
    {
        double p = length * 4;
        System.out.println("The perimeter of the square is " + p);
    }
    
    public void calcArea()
    {
        double a = Math.pow(length,2);
        System.out.println("The area of the square is " + a);
    }
}
