package synchronization;


class Thread1 extends Thread {
    MathUtils mu;

    public Thread1(MathUtils mu){
        this.mu = mu;
    }

    public void run(){
        try{
            mu.getMultiples(10);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}