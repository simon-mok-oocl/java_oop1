package com.afs.oopractice;

public class Truck extends Vehicle{
    public Truck(String name , int speed , Engine engine)
    {
        super(name , speed , engine);
    }
    public void drive()
    {
        System.out.printf("%s: speed up %d km/h\n" , this.name , this.speed);
    }
}
