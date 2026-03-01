import java.util.Scanner;

public class Digitsin {
	public static void main(StringEx[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		 int number = sc.nextInt();
		 
		 int count = 0;
		 
		 number = Math.abs(number);
		 
		 if (number == 0) {
			 count = 1;
			 
		 } else {
			 while (number != 0) {
				 number = number / 10;
				 count++;
				 
			 }
			 
		 }
		 
		 System.out.println("Total digits = " + count);
		 
		 sc.close();
	}

}
