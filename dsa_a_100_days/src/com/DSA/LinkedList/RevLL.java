package com.DSA.LinkedList;

public class RevLL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public RevLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        if(head == null) return;
        while(temp!= null) {
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
            tail = newNode;  
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) {
            return null;
        }

        Node pre = null;
        Node temp = head;

        while(temp.next!=null) {
            pre = temp;
            temp = temp.next;
        }

        pre.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;        
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node removal = head;
        head = removal.next;
        removal.next = null;
        length--;

        if(length == 0) {
            tail = null;
        }

        return removal;
    }

    // public Node get(int index) {
        
    // }
}
