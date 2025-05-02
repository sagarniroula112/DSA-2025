package com.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        RevLL myList = new RevLL(6);
        myList.append(9);
        myList.append(10);
        myList.removeLast();
        myList.printList();

        // LinkedList myLinkedList = new LinkedList(0);
        
        // myLinkedList.append(2);

        // myLinkedList.insert(1, 1);
        // myLinkedList.insert(0, 69);
        // myLinkedList.append(5);

        // // myLinkedList.remove(0);
        // myLinkedList.reverse();
        // System.out.println(myLinkedList.findMiddleNode().value);
        // myLinkedList.printList();
    }
}
