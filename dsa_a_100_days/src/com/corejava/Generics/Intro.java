package com.corejava.Generics;

class Gen<T> {
    T ob; // Declare an object of type T

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

public class Intro {
    public static void main(String[] args) {
        Gen<Integer> iOb;  // Create a Gen reference for Integers.

        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
