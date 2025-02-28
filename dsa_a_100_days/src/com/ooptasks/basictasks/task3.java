package com.ooptasks.basictasks;

/*
 * Task: Create a Shape class with methods area() and perimeter(). Create different classes like Circle and 
 * Rectangle that implement these methods differently. 
 * Use method overloading to add a method area() that accepts different parameters.
 */

class Shape {
    void area() {
        System.out.println("Area of shape");
    }

    void perimeter() {
        System.out.println("Perimeter of shape");
    }
}

class Circle extends Shape {
    void area(int r) {
        System.out.println("Area of circle with single r");
    }
}

class Rectangle extends Shape {
    void area(int l, int b) {
        System.out.println("Area of rectangle with l and b");
    }
}

public class task3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5);
        c.area();

        Rectangle r = new Rectangle();
        r.area();
        r.area(4,6);
    }
}
