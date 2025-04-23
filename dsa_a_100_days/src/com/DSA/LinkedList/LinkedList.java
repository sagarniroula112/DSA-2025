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

    public void printList() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length = length + 1;
    }

    public Node removeLast() {
        if(length == 0) return null; // Case for when initially we start with 0 nodes in linked list.

        Node pre = head;
        Node temp = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) { // Case for when there is only one node in linked list.
            head = null;
            tail = null;
        }

        return temp;
    }

    // public void prepend(int value) {}

    // public boolean insert(int index, int value) {}
}
