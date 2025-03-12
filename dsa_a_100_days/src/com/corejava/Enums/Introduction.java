package com.corejava.Enums;

enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class Introduction {
    public static void main(String[] args) {
        Days d;
        d = Days.Monday;

        // Output of enum value
        System.out.println("Value of d: " + d);
        System.out.println();
        
        d = Days.Saturday;

        // Comparison of two enum values
        if(d == Days.Saturday) {
            System.out.println("d contains: " + d);
        }
        
        // Enum for switch statement
        switch(d) {
            case Sunday:
                System.out.println("It is Sunday.");
                break;

            case Monday:
                System.out.println("It is Monday.");
                break;

            default:
                System.out.println("It is other.");
                break;
        }
    }
}
