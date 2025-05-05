package com.DSA.Queues;

public class Queue {
    Node first;
    Node last;
    int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Enqueue -> At the end where null is pointed by last node
    // Dequeue -> At the beginning of queue

    public void enqueue(int value) {
        Node newNode = new Node(value);
        Node temp = null;

        if(length == 0) {
            first = newNode;
            last = newNode;
        } else {
            temp = last;
            temp.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) return null;
        Node temp = first;

        first = temp.next;
        temp.next = null;

        return temp;
    }
}
