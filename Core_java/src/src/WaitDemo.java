class WaitDemo {
	
    public static void main(String[] args) throws Exception {

        final Object obj = new Object();

        Thread t1 = new Thread(() -> {synchronized (obj) {
            
                try {
                	
                    System.out.println("Waiting...");
                    obj.wait();
                    System.out.println("Resumed");
                } catch (Exception e) {}}});
            
    
        Thread t2 = new Thread(() -> {synchronized (obj) {System.out.println("Notifying...");   
                obj.notify();}});
            
        t1.start();
        Thread.sleep(500); 
        t2.start();
    }
    
}