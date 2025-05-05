package com.DSA.Queues;

public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue(6);
        myQ.enqueue(9);
        myQ.enqueue(19);
        myQ.enqueue(29);
        myQ.printQueue();
        System.out.println("*******DEQUEUED VALUES********");
        System.out.println(myQ.dequeue().value);
        System.out.println(myQ.dequeue().value);
        System.out.println(myQ.dequeue().value);
        System.out.println("-------------------------------");
        myQ.printQueue();
    }
}
