package com.corejava.Multithreading;

class NewThread2 implements Runnable {

    String name;
    Thread t;

    NewThread2(String threadName) {
        this.name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "exiting");
    }
}

public class CreatingMultThreads {
    public static void main(String[] args) {
        NewThread2 t1 = new NewThread2("One");
        NewThread2 t2 = new NewThread2("Two");
        NewThread2 t3 = new NewThread2("Three");

        t1.t.start();
        t2.t.start();
        t3.t.start();

        try{
            Thread.sleep(10000);
        }catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
