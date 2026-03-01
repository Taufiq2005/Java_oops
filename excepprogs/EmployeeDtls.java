package excepprogs;

public class Employee;
	
    int id;
    String name;
    double salary;
    String department;
    
    Employee(int id, String name) {
    	
        this.id = id;
        this.name = name;
        
    }
    
}

class EmployeeDtls extends Employee {
	
    EmployeeDtls(int id, String name, double salary, String department) {
    	
		super(id, name);
		// TODO Auto-generated constructor stub
	}
    
	double salary;
    String department;

    void Employee(int id, String name, double salary, String department) {
       

        if (salary < 0) {
            throw new ArithmeticException("Salary cannot be negative");
        }

        this.salary = salary;
        this.department = department;
    }

    void display() {
    	
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

	
    public static <emp2, EmployeeDtla> void main(String[] args) {

        try {
            EmployeeDtls emp1 = new EmployeeDtls(105, "Rahul",20000, "HR");
            EmployeeDtls emp2 = new EmployeeDtls(110, "Kavin", 25000, "IT");
            System.out.println("Employee 2 Details:");
            emp1.display();
            emp2.display();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
	

