package excepprogs;	

 import java.util.Scanner;

public class Excep3 {
	
		
		public static void main(String[] args) {
			
			int arr[]= {3,7,2,8};
			int a=5;
			int b=3;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice of Index");
			int ind = sc.nextInt();
			
			try
			
			{
				
				System.out.println(a/b);
				System.out.println(arr[ind]);
				
			}
			
			catch(ArithmeticException | ArrayIndexOutOfBoundsException ar)  //jdk1.7
			
			{
				System.out.println(ar);
				
			}
			
			System.out.println("After Exception");
			
			
		}
		

	}



