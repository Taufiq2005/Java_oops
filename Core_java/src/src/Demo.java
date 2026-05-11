class Demo {
	
    public static void main(String[] args) throws Exception {
    	
        Object o = new Object();

        new Thread(() -> {synchronized(o) {
            
                try {
                	
                    System.out.println("Wait");
                    o.wait();
                    System.out.println("Resume");
                } catch (Exception e) {}
            }
        
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {synchronized(o) {
            
                System.out.println("Notify");
                o.notify();
            }
        
        }).start();
    }
}