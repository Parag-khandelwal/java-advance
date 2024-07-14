package synchronization;

class MathUtils{
    // synchronized keyword => Two threads will not be able to access same method at same time.

    // synchronized public void getMultiples(int n){
    public void getMultiples(int n){

        
        synchronized (this){ // this will make only some part of code synchronized not the whole method.

            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

public class SynchronizationAndLocks {
    public static void main(String[] args) {
        MathUtils object = new MathUtils();

        Thread1 t1 = new Thread1(object);
        Thread t2 = new Thread(new Thread2(object));

        t1.start();
        t2.start();

    }
}