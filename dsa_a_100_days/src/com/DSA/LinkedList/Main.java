package com.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        
        myLinkedList.append(2);

        myLinkedList.insert(1, 1);
        myLinkedList.insert(0, 69);

        // myLinkedList.remove(0);
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
