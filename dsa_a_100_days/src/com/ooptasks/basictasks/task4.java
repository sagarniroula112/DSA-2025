package com.ooptasks.basictasks;

/*
 * 4. Basic Interface Implementation:
Task: Create an interface Animal with methods eat() and sleep(). 
Create a Dog class that implements the Animal interface and provides its own implementation of these methods.
 */

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class task4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}
