package com.corejava.FileIO;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImportEg {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1=3.0;
        side2=4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println(hypot);
    }
}
