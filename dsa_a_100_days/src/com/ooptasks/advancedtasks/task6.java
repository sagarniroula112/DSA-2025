package com.ooptasks.advancedtasks;

/*
 * 14. Lambda Expressions and Functional Interfaces:
Task: Create a functional interface MathOperation with a method operate(). Implement the interface using a 
lambda expression to perform various operations like addition, subtraction, multiplication, etc.
 */

interface MathOperation {
    void operate(int a, int b);
}

public class task6 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> System.out.println("Addition: " + (a+b));
        MathOperation subtraction = (a, b) -> System.out.println("Subtraction: " + (a-b));
        MathOperation multiplication = (a, b) -> System.out.println("Multiplication: " + (a*b));
        MathOperation division = (a, b) -> System.out.println("Division: " + (a/b));

        addition.operate(5, 3);
        subtraction.operate(5, 3);
        multiplication.operate(5, 3);
        division.operate(5, 3);
    }
}
