package concurrency2;

public class main {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            numberPrinter np = new numberPrinter(i);
            Thread thread = new Thread(np);
            thread.start();
        }
    }
}
