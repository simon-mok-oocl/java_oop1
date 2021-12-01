package com.afs.oopractice;

public class Driver {
    Vehicle vehicle;

    public Driver(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void driveMyVehicle()
    {
        vehicle.drive();
    }

    public void printMaxSpeed()
    {
        System.out.printf("Driver, my top speed is %d\n" , vehicle.getMaxSpeed());
    }
}
