package excepprogs;

import java.util.Scanner;

public class Excep1 {
	
	public static void main(String[] args) {
		
		int arr[]= {3,7,2,8};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur choice of Index");
		
		int ind = sc.nextInt();
		
		try
		
		{
			System.out.println(arr[ind]);
		}
		
		catch(ArrayIndexOutOfBoundsException ar)
		
		{
			System.out.println(ar);
		}
		
		System.out.println("After Exception");
	}
	
	    
		}
	
	 

	
