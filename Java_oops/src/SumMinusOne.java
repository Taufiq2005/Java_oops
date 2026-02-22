import java.util.Scanner;

public class SumMinusOne {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        int number;

	        System.out.println("Enter integers (enter -1 to stop):");

	        while (true) {
	            number = scanner.nextInt();

	            if (number == -1) {
	                break; // stop when -1 is entered
	            }

	            sum += number; // add to sum
	        }

	        System.out.println("The sum of entered numbers is: " + sum);
	        scanner.close();
	    }
	}



