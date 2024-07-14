package multithreading;

// Implements Runnable is given to us bcoz sometimes there might be a case that we need to extend our class from another class and also extend it from Thread class, Hence java does not provide multiple inheritance so we extend it with other class and implements Runnable interface

// Ex: class Thread2 extends Students extends Thread {} => Not supported
// Instead => class Thread2 extends Students implements Runnable {} => correct

class Thread2 implements Runnable {

    @Override
    public void run(){
        try {
            System.out.println("Thread 2 is running!");
        } catch (Exception e) {
            System.out.println("Exception occured!\n" + e);
        }
    }    
}