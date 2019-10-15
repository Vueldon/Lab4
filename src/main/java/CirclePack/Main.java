/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirclePack;

import java.util.Scanner;

/**
 *
 * @author vueld
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the circle's radius");
        double radius = keyboard.nextDouble();
        
        Circle circle1 = new Circle(radius);
        
        System.out.println("Area: " + circle1.area());
        System.out.println("Diameter: " + circle1.diameter());
        System.out.println("Circumference: " + circle1.circumference());
    }
    
}
