package com.corejava.OOPS.static1;

class Student {
    String name;
    static String school;
}

public class learnstatic {
    public static void main(String[] args) {
        Student.school = "PPS";
        Student std1 = new Student();

        std1.name = "sagar";
        System.out.println(std1.name);
    }
}
