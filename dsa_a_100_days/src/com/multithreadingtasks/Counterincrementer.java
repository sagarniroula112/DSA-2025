// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class Main {
//     public static void main(String[] args) {
//         Counter c = new Counter();
//         MyThread t1 = new MyThread(c, "First");
//         MyThread t2 = new MyThread(c, "Second");
//         MyThread t3 = new MyThread(c, "Third");
        
//         t1.t.start();
//         t2.t.start();
//         t3.t.start();
        
//         try{
//             t1.t.join();
//             t2.t.join();
//             t3.t.join();
//         }catch(InterruptedException e) {
//             System.out.println("Interrupt occured!");
//         }
        
//         System.out.println("Final Count: " + c.getCount());
//     }
// }

// class Counter {
//     private int count;
    
//     synchronized public void increment() {
//         count++;
//         System.out.println("Count: " + count);
//         try {
//             Thread.sleep(500);
//         } catch (InterruptedException e) {
//             System.out.println("Interrupted!");
//         }
//     }
    
//     public int getCount() {
//         return count;
//     }
// }

// class MyThread implements Runnable {
//     Thread t;
//     Counter c;
//     String name;
    
//     MyThread(Counter counter, String tName) {
//         this.c = counter;
//         t = new Thread(this, tName);
//         this.name = tName;
//     }
    
//     @Override
//     public void run() {
//         try{
//             for(int i=0;i<5;i++){
//                 c.increment(); 
//                 // Thread.sleep(2000);
//             }
//         }catch(Exception e) {
//             System.out.println("Exception occured.");
//         }
//     }
// }