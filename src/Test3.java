interface Message {
	
    Test3 getMessage();
}

public class Test3 {

    Test3() {
    	
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {

        Message m = Test3::new;

        m.getMessage();
    }
    
}