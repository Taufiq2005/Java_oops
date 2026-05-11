import java.util.concurrent.ConcurrentHashMap;

class MyThread extends Thread {
	
    static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    public void run() {
    	
        map.put(3, "C");
        map.put(4, "D");
    }
}

public class CHMExample {
	
    public static void main(String[] args) throws InterruptedException {

        MyThread.map.put(1, "A");
        MyThread.map.put(2, "B");

        MyThread t1 = new MyThread();
        t1.start();

        t1.join();

        
        System.out.println(MyThread.map);
    }
    
}