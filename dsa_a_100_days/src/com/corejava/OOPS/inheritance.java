package com.corejava.OOPS;

class Shape {
    String color;

    public void area() {
        System.out.println("Displays area...");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1/2*l*h);
//     }
// }

class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

// 1. Single level inheritance - One Base -> One Derived
// 2. Multi level inheritance - One Base -> One Derived -> Again Derived
// 3. Hierarchical inheritance - One Base -> Multiple Derived
// 4. Hybrid inheritance - One branch has single level, another may be multi level
// 5. Multiple inheritance - Not used in java. Instead, interfaces are used. Why??

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
