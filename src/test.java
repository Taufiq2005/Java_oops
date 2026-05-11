import java.util.*;
import java.util.concurrent.*;

public class test {
	
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
        chm.put(1, "A");
        chm.put(2, "B");

        Hashtable<Integer, String> ht = new Hashtable<>();
        
        ht.put(1, "A");
        ht.put(2, "B");

        System.out.println("CHM: " + chm);
        System.out.println("HT: " + ht);
        
    }
    
}