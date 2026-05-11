import java.util.*;
import java.util.stream.*;

class Employee2 {
	
    int id;
    String name;
    String dept;
    double salary;

    Employee2(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }
	
    public static void main(String[] args) {

        List<Employee2> list = Arrays.asList(
                new Employee2(1, "A", "IT", 50000),
                new Employee2(2, "B", "HR", 40000),
                new Employee2(3, "C", "IT", 60000),
                new Employee2(4, "D", "HR", 45000),
                new Employee2(5, "E", "Sales", 30000));
        
        Map<String, Double> avgSalary = list.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.averagingDouble(Employee2::getSalary)));
                
               
        avgSalary.forEach((dept, avg) ->System.out.println(dept + " : " + avg));
                       
    }
    
}