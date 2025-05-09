package com.DSA.Stacks;

public class Stack {
    private int height;
    private Node top;

    class Node {
        private Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        this.height = 1;
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }

        height++;
    }

    public Node pop() {
        if(height == 0) return null;
        
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }
}
