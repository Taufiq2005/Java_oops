package excepprogs;

import java.util.Scanner;
 
public class EmployeeMain {

   
    public EmployeeMain(int id, String name, double salary, String dept) {
		// TODO Auto-generated constructor stub
    	
    }
        
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        EmployeeMain[] emp = new EmployeeMain[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEmployee " + (i + 1));

                System.out.println("Enter ID:");
                int id = sc.nextInt();

                System.out.println("Enter Name:");
                String name = sc.next();

                System.out.println("Enter Salary:");
                double salary = sc.nextDouble();

                System.out.println("Enter Department:");
                String dept = sc.next();

                emp[i] = new EmployeeMain(id, name, salary, dept);

           
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                i--;
            }
        }

        System.out.println("\n--- Employee Details ---");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
        
        try{
        	EmployeeMain emp1 = new EmployeeMain(105,"Rahul",20000,"HR");
        	  EmployeeMain emp2 = new EmployeeMain(110,"Kavin",25000,"IT");
        	  {
      
	    System.out.println("EmployeeMain emp 1");
	    System.out.println("EmployeeMain emp 2");
        
	    
        	  
        		  
        	 
    }

	private void display() {
		// TODO Auto-generated method stub
		
	}
}