package com.corejava.Multithreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // getting the reference to main thread
        System.out.println("Current thread: " + t);

        t.setName("My thread");
        System.out.println("After changing name: " + t);

        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000); // causes the thread to stop execution for specified miliseconds
                // the thread from which it is called i.e. the sleep() method
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
    }
}

// Order: Thread ID assigned by JVM (to distinguish threads), Name of thread, priority, name of the thread group
