package com.corejava.Multithreading;

class Queue {
    int n;
    boolean setState = false;
    
    synchronized public int get() {
        try{
            while(!setState) {
                wait();
            }
        }catch(InterruptedException e) {
            System.out.println("Interrupt occured.");
        }
        
        setState = false;
        System.out.println("Get: " + n);
        notify();
        return n;
    }
    
    synchronized public void put(int n) {
        try{
            while(setState) {
                wait();
            }
        }catch(InterruptedException e) {
            System.out.println("Interrupt occured.");
        }
        
        this.n = n;
        setState = true;
        notify();
        System.out.println("Put: " + n);
    }
}

class Producer implements Runnable {
    Thread t;
    Queue q;
    
    Producer(Queue qu) {
        t  = new Thread(this, "Producer");
        q = qu;
    }
    
    @Override
    public void run() {
        try{
            int i = 0;
            while(true) {
                q.put(i++);
            }
        }catch(Exception e) {
            System.out.println("Interrupt occured.");
        }
    }
}

class Consumer implements Runnable {
    Thread t;
    Queue q;
    
    Consumer(Queue qu) {
        q = qu;
        t = new Thread(this, "Consumer");
    }
    
    @Override
    public void run() {
        try{
            while(true) {
                q.get();
            }
        }catch(Exception e) {
            System.out.println("Interrupt occured.");
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);
        
        p.t.start();
        c.t.start();
        
        try{
            p.t.join();
            c.t.join();
        }catch(InterruptedException e) {
            System.out.println("Interrupt occured.");
        }
        
        System.out.println("Producer and consumer demo completed.");
    }
}