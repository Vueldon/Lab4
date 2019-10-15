
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class Car 
{
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int yearModel, String make)
    {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    
    public int getYearModel()
    {
        return yearModel;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int accelerate()
    {
        this.speed = speed + 5;
        return this.speed;
    }
    
    public int brake()
    {
        this.speed = speed - 5;
        return this.speed;
    }
}
