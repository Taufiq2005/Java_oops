interface Sayable {
    void say();
}

class Hello {
	
    public void display() {
    	
        System.out.println("Hello Java 8");
    }
}

public class Test2 {
	
    public static void main(String[] args) {

        Hello h = new Hello();

        Sayable s = h::display;

        s.say();
    }
    
}