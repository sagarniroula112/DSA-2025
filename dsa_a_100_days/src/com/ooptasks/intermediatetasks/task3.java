package com.ooptasks.intermediatetasks;

/*
 * 7. Abstract Classes and Interfaces:
Task: Create an abstract class Appliance with an abstract method turnOn(). 
Create a class WashingMachine that extends Appliance and implements turnOn(). 
Also, create a RemoteControl interface and make WashingMachine implement it.
 */

abstract class Appliance {
    abstract void turnOn();
}

interface RemoteControl {
    void remotelyControlled();
}

class WashingMachine extends Appliance implements RemoteControl{
    public void turnOn() {
        System.out.println("Washing machine is turned on!");
    }

    public void remotelyControlled() {
        System.out.println("Controlled using remote!");
    }
}

public class task3 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.turnOn();
        wm.remotelyControlled();
    }
}
