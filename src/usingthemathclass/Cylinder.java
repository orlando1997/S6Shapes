/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usingthemathclass;

/**
 *
 * @author jonathanmolson
 */
public class Cylinder 
{
    //this class is going to be used to represent a cylinder, it will contain methods to calculate the volume and the surface area
    
    double pi = Math.PI; //here I am using the PI constant which is available in the Math class.  
                          //I am accessing it by putting the name of the class before the name of the constant.
                          //I have used a double because PI is a floating point number not an integer
    double r; //this variable is used to represent the radius of the cylinder
    double h; //this variable is used to represent the height of the cylinder
    
    public Cylinder(double x, double y) //this is the constructor.  This is used to tell the computer how to create an object
                                                 //of this type
    {
        r = x;//The two pieces of data that you provide when you create an object of this type are assigned to represent the radius and 
        h = y;//the height
    }
    
    public void SurfaceArea() //this is the method declaration for calulating the surface area.  It will not return any information and 
    {                          //doesn't need an data to calculate the surface area
        double sa = (2 * pi * Math.pow(r, 2)) + (2 * pi * r * h);//here we have used the pow method which is described in the Math class
        System.out.println("The surface area of this cylinder is " + sa);        
    }
    
    public void Volume() //this is the method declaration to calulate the volume of the cylinder
    {
        double v = 2 * pi * Math.pow(r,2) * h;
        System.out.println("The volume of the cylinder is " + v);
    }
    
}
