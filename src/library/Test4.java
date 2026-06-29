package library;
   class MyThread extends Thread {
	   
	     public void run() {
	    	 
	    	 System.out.println("Thread Running");
	    	 
	     }
	     
   }
   
        class Test4 {
        	
        	public static void main(String[] args) throws Exception {
        		
        		MyThread t = new MyThread();
        		
        		t.start();
        		
        		t.join();
        		
        		System.out.println("Main Thread");
        			
			}
        }
	
