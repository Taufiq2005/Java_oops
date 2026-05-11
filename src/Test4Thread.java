import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {

    public void run() {
    	
        System.out.println("Task executed by: " + Thread.currentThread().getName());
               
    }
}

public class Test4Thread {
	
    public static void main(String[] args) {

        ExecutorService executor =Executors.newFixedThreadPool(3);

        executor.execute(new MyTask());
        executor.execute(new MyTask());
        executor.execute(new MyTask());

        executor.shutdown();
    }
    
}