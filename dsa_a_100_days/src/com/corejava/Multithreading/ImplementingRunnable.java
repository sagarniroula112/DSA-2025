package com.corejava.Multithreading;

// Both main thread and child thread run sharing the CPU in single core systems until their loops finish.

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    // Here a new thread is constructed using Thread class and its constructor. 
    // Thread(Runnable threadObj, String threadName)
    // threadObj -> Instance of a class that implements Runnable interface (here it is NewThread).
    // threadName -> Name of the new thread.

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();  // The thread will not start running until it start() method is called. start() => run()

        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thead: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
