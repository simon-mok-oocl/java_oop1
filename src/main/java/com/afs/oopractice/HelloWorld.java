package com.afs.oopractice;

import com.sun.glass.events.GestureEvent;

public class HelloWorld {
    public static void main(String[] args) {
        Driver truckDriver = new Driver(new Truck("turck1" , 10 , new EelectricEngine()));
        Driver carDriver = new Driver(new Car("car1" , 30 , new GasolineEngine()));

        truckDriver.driveMyVehicle();
        carDriver.driveMyVehicle();

        truckDriver.printMaxSpeed();
        carDriver.printMaxSpeed();
    }
}
