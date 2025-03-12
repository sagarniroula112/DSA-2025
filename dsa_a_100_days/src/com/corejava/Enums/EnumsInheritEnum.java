package com.corejava.Enums;

// final int ordinal() : returns a constant's position (Ordinal values begin at 0)

// final int compareTo(enum-type e) : compares the ordinal value of two constants

// equals() : 

enum Companies {
    Samsung, Apple, Lenovo, Xiaomi
}

public class EnumsInheritEnum {
    public static void main(String[] args) {
        Companies c1, c2, c3;
        System.out.println("******All companies with their ordinal values******");

        // Demonstrate ordinal()
        for(Companies c: Companies.values()) {
            System.out.println(c + " " + c.ordinal());
        }

        c1 = Companies.Apple;
        c2 = Companies.Lenovo;
        c3 = Companies.Apple;

        System.out.println();

        // Demonstrate compareTo() and equals()
        if(c1.compareTo(c2) < 0) {
            System.out.println(c1 + " comes before " + c2);
        }
        if(c1.compareTo(c2) > 0) {
            System.out.println(c1 + " comes after " + c2);
        }
        if(c1.compareTo(c3) == 0) {
            System.out.println(c1 + " equals " + c3);
        }

        if(c1.equals(c3)) {
            System.out.println(c1 + " equals " + c3);
        }
        if(c1 == c3) {
            System.out.println(c1 + " equals " + c3);
        }
    }
}
