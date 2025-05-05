package com.DSA.Stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(6);

        myStack.push(9);
        myStack.push(6);
        myStack.printStack();
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
    }
}
