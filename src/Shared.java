class Shared {

    volatile boolean flag = true;

 public static void main(String[] args) {

        Shared s = new Shared();

        new Thread(() -> {
        	
            while (s.flag) {

            }
            
            System.out.println("Thread Stopped");
            
        }).start();

        try {
        	
            Thread.sleep(2000);
        } catch (Exception e) {
        	
        }
        
        s.flag = false;
        System.out.println("Flag Changed");
        
    }
 
}