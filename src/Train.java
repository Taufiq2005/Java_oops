import java.util.*;

public class Train {
	
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(1, "A");
        hm.put(2, null);   

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");

        System.out.println("HashMap: " + hm);
        System.out.println("Hashtable: " + ht);
    }
    
}