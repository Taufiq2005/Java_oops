import java.util.Scanner;

public class sum {
	
	 public static void main(StringEx[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number: ");
		 int n = sc.nextInt();
		 
		 int sum = 0;
		 
		 for (int i = 1; i<=n; i++){
			  sum+=i;
			  
		 }
		 
          System.out.println("sum from 1 to"+n+" is:" + sum);
          
          sc.close();
	}

}
