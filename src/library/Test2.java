package library;
public class Test2 {
	
	protected void finalize() {
		
		System.out.println("Finalize Method");
		
	}
	
	   public static void main(String[] args) {
		
		   Test t = new Test();
		   
		   t = null;
		   
		   System.gc();
		   
	}

}
