import java.util.*;

public class Tst1 {
	
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");

        list.addFirst("Start"); // Fast insertion

        System.out.println(list);
        
    }
    
}