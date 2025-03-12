package com.corejava.Enums;

enum Fruits {
    Apple, Orange, Banana, Guava
}

public class ValuesAndValueOf {
    public static void main(String[] args) {
        Fruits f = Fruits.Guava;
        System.out.println(f+"\n");
        
        // Use of values()
        Fruits[] allFruits = Fruits.values();
        for(Fruits fr:allFruits) {
            System.out.println(fr);
        }
        System.out.println();

        // Use of valueOf()
        Fruits fr2 = Fruits.valueOf("Guava");
        System.out.println(fr2);
    }
}
