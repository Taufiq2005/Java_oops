import java.util.Scanner;

public class Smallprimefactors {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	for(int i = 2; i<=n; i++) {
		int count = 0;
		
	// check prime
		for(int j = 1; j<=i;j++) {
			if(i % j == 0)
				count++;
			
		}
		
		if(count == 2) { //prime number
			long fact = 1;
			for(int k = 1;k <=i; k++)
				fact*= k;
			
			System.out.println(i + "!=" +fact);
		}
		
	}
		
		sc.close();
		
	}
	
	
}		
		
		

		
		
		
	


