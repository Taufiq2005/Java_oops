import java.util.*;

public class Tst3 {
	
    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 30, 20, 40};

        // Method 1: Using LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
        	
            set.add(num);
        }

        System.out.println("Using LinkedHashSet: " + set);


        // Method 2: Without Built-in Classes
        System.out.print("Without Built-in: ");

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
            	
                System.out.print(arr[i] + " ");
            }
        }
    }
}