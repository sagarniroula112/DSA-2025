package com.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);

        // myLinkedList.append(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.set(2, 9);

        System.out.println(myLinkedList.get(2).value);
        System.out.println("---------------------------");
        myLinkedList.printList();
    }
}
