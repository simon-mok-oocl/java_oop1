package com.afs.oopractice;

abstract class Vehicle {
    String name;
    int speed;
    Engine engine;

    public Vehicle(String name , int speed , Engine engine)
    {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }

    public abstract void drive();

    public int getMaxSpeed()
    {
        return engine.getMaxSpeed();
    }
}
