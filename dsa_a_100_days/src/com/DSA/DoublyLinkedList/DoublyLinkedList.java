package com.DSA.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printItems() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node toRemove = tail;

        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            toRemove.prev = null;
            tail.next = null;
        }
        length--;
        return toRemove;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            temp.next = null;
            head = head.next;
            head.prev = null;
        }
        length--;

        return temp;
    }
}