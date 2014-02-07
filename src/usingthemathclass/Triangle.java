/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usingthemathclass;

/**
 *
 * @author jonathanmolson
 */
public class Triangle 
{
    double opp;
    double adj;
    
    public Triangle(double o, double a)
    {
        opp = o;
        adj = a;
    }
    
    public void area()
    {
        double a = (opp * adj) / 2;
        System.out.println("The area of the triangle is " + a);
    }
    
    public void calcHyp()
    {
        //you should write your code to calculate the hypotenuse and output the result to the screen here
    }
    
    public void calcAngles()
    {
        //you should write your code to calculate the size of the other two angles here
    }
}
