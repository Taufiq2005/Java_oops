import java.util.Scanner;

public class Multiple {
	
	public static void main(StringEx[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(num +"x" +i+"="+(num*i));
			
		}
		
		sc.close();
	}

}
