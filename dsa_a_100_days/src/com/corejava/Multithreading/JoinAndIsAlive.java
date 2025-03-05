package com.corejava.Multithreading;

class MyThread implements Runnable {
    String name;
    Thread t;

    MyThread(String threadName) {
        this.name = threadName;
        t = new Thread(this, threadName);
        System.out.println("Thread named:: " + threadName + " created.");
    }

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Thread named:: " + name + " " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Thread named:: " + name + " interrupted.");
        }
        System.out.println("Thread named:: " + name + " exited.");
    }
}

public class JoinAndIsAlive {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("One");
        MyThread t2 = new MyThread("Two");
        MyThread t3 = new MyThread("Three");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        System.out.println("Thread One is alive: " + t1.t.isAlive());
        System.out.println("Thread Two is alive: " + t2.t.isAlive());
        System.out.println("Thread Three is alive: " + t3.t.isAlive());

        try {
            System.out.println("Waiting for threads to finish .......");
            t1.t.join();
            t2.t.join();
            t3.t.join();// Main thread will wait for t1, t2 and t3 to finish. Then only it will proceed beyond this.
            for(int i=5;i>0;i--){
                System.out.println("Thread named:: " + "MAIN" + " " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread One is alive: " + t1.t.isAlive());
        System.out.println("Thread Two is alive: " + t2.t.isAlive());
        System.out.println("Thread Three is alive: " + t3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}
