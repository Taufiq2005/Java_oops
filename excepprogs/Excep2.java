package excepprogs;

import java.util.Scanner;

public class Excep2 {
	
	public static void main(String[] args) {
		
		int arr[]= {3,7,2,8};
		int a=5;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur choice of Index");
		int ind = sc.nextInt();
		
		try
		
		{
			
			System.out.println(a/b);
			System.out.println(arr[ind]);
			
		}
		
		/*catch(ArrayIndexOutOfBoundsException ar)
		
		{
			System.out.println(ar);
		}*/
		
		catch(Exception e)  // Exception is a parent class for all the exception
		
		{
			
			System.out.println("2nd catch block "+e);
			
		}
		
		System.out.println("After Exception");
		
	}
	
	
	

}
