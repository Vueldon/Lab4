
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Car car1 = new Car(2008, "Chevy Impala");
        
        for(int x = 0; x < 5; x++)
        {
            car1.accelerate();
            int currentSpeed = car1.getSpeed();
            System.out.println("Speed: " + currentSpeed);
        }
        
        for(int x = 0; x < 5; x++)
        {
            car1.brake();
            int currentSpeed = car1.getSpeed();
            System.out.println("Speed: " + currentSpeed);
        }
    }
    
}
