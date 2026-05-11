class Singleton {
	
    // Step 1: Create static object of same class
    private static Singleton obj = new Singleton();

    // Step 2: Make constructor private
    private Singleton() {
        System.out.println("Object Created");
    }

    // Step 3: Provide public method to return object
    public static Singleton getInstance() {
        return obj;
    }
    
	
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("Both are same object");
        }
        
    }
    
}