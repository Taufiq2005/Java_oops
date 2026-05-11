class MyThread extends Thread {

    public void run() {
    	
        try {
        	
            System.out.println("Thread is Running");
            Thread.sleep(2000); // Waiting State
            System.out.println("Thread Finished");
        }
        
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycle {
	
    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();

        System.out.println("State after start: " + t.getState()); // RUNNABLE

        Thread.sleep(500);

        System.out.println("State during sleep: " + t.getState()); // TIMED_WAITING

        t.join();

        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}