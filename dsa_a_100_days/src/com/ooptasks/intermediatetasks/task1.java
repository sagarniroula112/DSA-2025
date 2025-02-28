package com.ooptasks.intermediatetasks;

/*
 * 5. Constructor Overloading:
Task: Create a Student class with constructor overloading. 
One constructor should accept name and age, while another should accept name, age, and grade.
 */

class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 0;
    }

    Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
}

public class task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sagar", 23);
        Student s2 = new Student("Shiva", 100, 12);

        System.out.println(s1.name + s1.grade);
        System.out.println(s2.name + s2.grade);
    }
}
