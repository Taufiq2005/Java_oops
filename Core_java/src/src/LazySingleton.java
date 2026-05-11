class LazySingleton {

    // Object not created immediately
    private static LazySingleton obj;

    // Private constructor
    private LazySingleton() {
        System.out.println("Object Created");
    }

    // Method to create object only when needed
    public static LazySingleton getInstance() {

        if (obj == null) {
            obj = new LazySingleton();
        }

        return obj;
    }
	
    public static void main(String[] args) {

        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
    
}