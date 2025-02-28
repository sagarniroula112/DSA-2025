package com.corejava;

// Package => Related code logically

// Encapsulation -> Data + functions combined in one entity
// Data hiding done by access modifiers
// Abstraction -> Showing useful details only to the user

// Abstract -> Concept, not real, but we can think and not use directly

// Abstract class must be declared with "abstract" keyword
// It can have abstract and non-abstract methods
// It cannot be instantiated
// It can have constructors and static methods
// It can have have final methods to not let sub classes change the body of the methods

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal using constructor!");
    }

    public void eats() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eats();
    }   
}
