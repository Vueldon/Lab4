/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirclePack;

/**
 *
 * @author vueld
 */
public class Circle 
{
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle()
    {
        radius = 0.0;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    
    public double area()
    {
        double area = PI * radius * radius;
        return area;
    }
    
    public double diameter()
    {
        double diameter = radius * 2;
        return diameter;
    }
    
    public double circumference()
    {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
