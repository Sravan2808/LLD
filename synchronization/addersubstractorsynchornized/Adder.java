package synchronization.addersubstractorsynchornized;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<=100000; i++){
            synchronized (count){// similar to lock.lock()
                count.value+=i;
            }// similar to lock.unlock()
        }
    }

}
