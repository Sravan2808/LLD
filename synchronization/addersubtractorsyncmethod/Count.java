package synchronization.addersubtractorsyncmethod;

public class Count {
    int value;

    public synchronized void add(int i){
        this.value += i;
    }

    public int getValue(){
        return value;
    }
}
