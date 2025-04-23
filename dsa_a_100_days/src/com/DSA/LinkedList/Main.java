package com.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);

        myLinkedList.printList();
        System.out.println("-----------------------------");

        myLinkedList.prepend(3);

        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast());

        myLinkedList.printList();

        System.out.println("----------------------------");
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println("----------------------------");
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println("----------------------------");
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println("----------------------------");
        System.out.println(myLinkedList.removeFirst());
        myLinkedList.printList();
    }
}
