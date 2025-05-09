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

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }

        Node removal = head;
        head = head.next;
        removal.next = null;
        length--;
        
        if(length == 0) {
            head = null;
            tail = null;
        }

        return removal;
    }

    public Node get(int index) {
        if(length < 0 || index >= length) {
            return null;
        }        
        
        Node temp = head;

        for(int i=0;i<index;i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
        if(index < 0 || index >= length) {
            return false;
        }

        Node temp = head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }

        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }

        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length) {
            append(value);
            return true;
        }

        Node temp = head;

        for(int i=0;i<index-1;i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        if(index == 0) {
            return removeFirst();
        }

        if(index == length-1) {
            return removeLast();
        }

        Node pre = null;
        Node temp = head;

        for(int i=0;i<index;i++) {
            pre = temp;
            temp = temp.next;
        }

        pre.next = temp.next;
        
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0;i<length;i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // public Node findMiddleNode() {
    //     int count = 1;
    //     Node temp = head;
        
    //     while(temp.next != null) {
    //         temp = temp.next;
    //         count++;
    //     }
    //     double mid = count/2;
    //     if(mid % 2 != 0) {
    //         mid = (count/2) + 0.5;
    //     }

    //     int indx = (int)mid;

    //     temp = head;
    //     for(int i=0;i<indx;i++) {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
}
