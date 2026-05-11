class DemoMode {
    int x = 10;
}

public class HeapExample {
	
    public static void main(String[] args) {
    
        for(int i = 0; i < 5; i++) {
        	
            DemoMode d = new DemoMode();
            System.out.println(d.x);
        }

        System.gc();
    }
    
}