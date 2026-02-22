
public class ArrayStats {
	
	    public static void main(String[] args) {
	        int[] arr = {11, 25, 33, 47, 54, 88, 95, 15, 55, 75,
	                     32, 44, 55, 66, 77, 88, 99, 21, 31, 41};

	        int sum = 0;
	        for (int num : arr) sum += num;

	        double avg = (double) sum / arr.length;

	        int count = 0;
	        for (int num : arr) if (num < avg) count++;

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);
	        System.out.println("Values less than average = " + count);
	    }
	}



