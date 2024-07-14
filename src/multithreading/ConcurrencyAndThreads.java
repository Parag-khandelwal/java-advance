package multithreading;
// CONCURRENCY MEANS RUNNING MULTIPLE TASKS PARALLELY, AND IT IS ACHIEVED BY THREADS(lightweight) AND PROCESSES (heavy)

class Thread1 extends Thread{

    @Override
    public void run(){
        try {
            System.out.println("Thread 1 is running!");
        } catch (Exception e) {
            System.out.println("Exception occured\n" + e);
        }
    }
}



public class ConcurrencyAndThreads {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            // Whenever Thread finds ideal CPU it executes so the sequence of execution is unpredictable
            
            Thread1 t1 = new Thread1();
            t1.start();
            
            Thread t2 = new Thread(new Thread2());
            t2.start();
            
        }
    }
}
