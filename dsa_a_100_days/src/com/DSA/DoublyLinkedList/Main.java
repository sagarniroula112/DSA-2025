package com.DSA.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);
        myDLL.append(5);
        myDLL.printItems();
        myDLL.removeLast();
        myDLL.prepend(5);
        myDLL.printItems();
        System.out.println("-------------------------------");
        myDLL.removeFirst();
        myDLL.printItems();
    }
}
