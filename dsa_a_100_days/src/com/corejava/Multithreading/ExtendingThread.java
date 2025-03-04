package com.corejava.Multithreading;

// Second way to create thread -> By creating a class that extends Thread class.

class NewThread1 extends Thread {
    NewThread1() {
        super("Demo Thread.");
        // This is a form of Thread constructor -> public Thread(String threadName)
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();

        nt.start();

        try {
            for(int i=5;i>0;i--){
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}
