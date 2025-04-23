package com.DSA.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {  // Inner/Nested Class
        int value;
        Node next; // this variable called next can point to another node.
    
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // public void append(int value) {}

    // public void prepend(int value) {}

    // public boolean insert(int index, int value) {}
}
