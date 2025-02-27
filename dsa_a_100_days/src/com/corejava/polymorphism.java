package com.corejava;

// Poly -> many, morph -> forms
// 1. Function overloading -> Compiletime polymorphism
// 2. Function overriding -> Runtime polymorphism

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hero";
        s1.age = 20;

        s1.printInfo(s1.age);
    }
}
