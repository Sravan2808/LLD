package executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){
            if(i==5 || i==10 || i==50 || i==100) System.out.println("DEBUG");
            NumberPrinter np = new NumberPrinter(i);

            //Submit the task to executor service.
            executorService.submit(np);
        }
    }
}
