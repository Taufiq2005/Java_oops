import java.util.*;
import java.util.stream.*;

class Employee3 {
	
    int id;
    String name;

    Employee3(int id, String name) {
    	
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
	
    public static void main(String[] args) {

        List<Employee3> list = Arrays.asList(
                new Employee3(1, "A"),
                new Employee3(2, "B"),
                new Employee3(3, "C"));
       

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee3::getId,Employee3::getName));

        System.out.println(map);
    }
    
}
