package excepprogs;

import java.util.Scanner;

public class Excep4 {
	
	public static void main(String[] args) {
		
		int arr[]= {3,7,2,8};
		int a=5;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur choice of Index");
		int ind = sc.nextInt();
		
		try
		
		{
			try
			
			{
				System.out.println(a/b);
				
			}
			
			catch(ArithmeticException ae)
			
			{
				System.out.println(ae);
				
			}
			
			System.out.println(arr[ind]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException ar)  //jdk1.7
		
		{
			
			System.out.println(ar);
			
		}
		
		System.out.println("After Exception");
		
	}
	

}