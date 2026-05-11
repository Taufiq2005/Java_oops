class singleton_ implements Cloneable {

    private static singleton_ obj = new singleton_();

    private singleton_() {
        System.out.println("Singleton Created");
    }

    public static singleton_ getInstance() {
        return obj;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
 public static void main(String[] args) {

        try {
        	
            singleton_ s1 = singleton_.getInstance();

            singleton_ s2 = (singleton_) s1.clone();

            System.out.println(s1);
            System.out.println(s2);

        } 
        
        catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Allowed");
        }
        
    }
 
}