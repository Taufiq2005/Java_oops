public class JDKVersion {
	
    public static void main(String[] args) {

        // Method 1
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // Method 2
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));

        // Method 3
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        
    }
    
}