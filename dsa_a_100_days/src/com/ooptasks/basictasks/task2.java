package com.ooptasks.basictasks;

/*
 * Task: Create a Vehicle class with attributes make, model, and year. 
 * Create a Car class that extends Vehicle and adds an additional attribute: fuelType.
 */

class Vehicle {
    String make;
    String model;
    int year;
}

class Car extends Vehicle {
    String fuelType;
}

public class task2 {
    public static void main(String[] args) {
        Car c = new Car();

        c.make = "";
        c.model = "";
        c.year = 0;
        c.fuelType = "";
    }
}
