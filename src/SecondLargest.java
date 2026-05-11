import java.util.*;

public class SecondLargest {
	
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 50, 30, 20, 50, 45);

        Integer secondLargest = list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest Number: " + secondLargest);
        
    }
    
}