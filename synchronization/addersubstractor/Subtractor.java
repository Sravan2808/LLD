package synchronization.addersubstractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    public Subtractor(Count count, Lock lock) {
    }

    @Override
    public void run(){
        for(int i=1;i<=100000;i++){
            count.value-=i;
        }
    }

}
