import java.util.Scanner;

public class SwitchEx {
	
	   public static void main(StringEx[] args) {
		
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter value for a and b");
		     int a = sc.nextInt();
		     int b = sc.nextInt();
		     System.out.println("1.add \n 2. subtraction \n 3. multiple");
		     System.out.println("Enter your choice");
		     int choice = sc.nextInt();
		     
		     switch (choice)
		     {
		     
		     case 1 : System.out.println(a+b);
		               break;
		     case 2 : System.out.println(a-b);
		               break;
		     case 3 :  System.out.println(a*b);
		               break;
		     default : System.out.println("your choice is wrong");          
		               
		     }
		     
		     
		     
	}

}
