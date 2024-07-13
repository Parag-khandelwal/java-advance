package multithreading;
// CONCURRENCY MEANS RUNNING MULTIPLE TASKS PARALLELY, AND IT IS ACHIEVED BY THREADS(lightweight) AND PROCESSES(heavy)


public class ConcurrencyAndThreads {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            Thread t1 = new Thread();
            t1.getId();
            t1.start();
    
            Thread t2 = new Thread(new Thread());
            t2.getId();
            t2.start();

        }
    }
}
