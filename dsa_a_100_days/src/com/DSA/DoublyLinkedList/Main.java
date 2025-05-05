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
        System.out.println("-------------------------------");
        System.out.println(myDLL.get(1).value);
        System.out.println("-------------------------------------------------");
        myDLL.set(0, 69);
        myDLL.insert(0, 1);
        myDLL.printItems();
        System.out.println("***************************************************");

        System.out.println(myDLL.remove(0).value);
        
    }
}
