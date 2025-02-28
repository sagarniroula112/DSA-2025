package com.ooptasks.intermediatetasks;

/*
 * 6. Inheritance with Overriding:
Task: Create a Person class with name and age. 
Create a Student class that extends Person and overrides the toString() method to print additional student details.
 */

 class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person {
    private int rollno;

    Student(String name, int age, int rollno) {
        super(name, age);
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return super.toString() + ", rollno=" + rollno + "}";
    }
}

public class task2 {
    public static void main(String[] args) {
        Person p = new Person("Rakesh", 23);
        Student s = new Student("Hari", 22, 69);

        // This will call the overridden toString method in Student class
        System.out.println(s);
    }
}
