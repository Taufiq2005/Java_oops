class Emp5 {

    void work() {
    	
        System.out.println("Employee Working");
    }
    
 public static void main(String[] args) {

        // Inheritance Proof
        Emp5 e = new Emp5();

        System.out.println(e instanceof Object);

        // Polymorphism Proof
        Object obj = new Emp5();

        System.out.println(obj.getClass());
    }
}