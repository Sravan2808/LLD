package concurrency2;

public class numberPrinter implements Runnable{

    private int number;

    numberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(number+"-"+Thread.currentThread().getName());
    }
}
