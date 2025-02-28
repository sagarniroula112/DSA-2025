package com.corejava.OOPS;

interface Animal {
    int eyes = 2;

    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class learninterface {
    
}
