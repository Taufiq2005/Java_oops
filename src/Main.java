public class Main {
	
    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();

        Employee emp = new Employee(1, "Taufiq", date);

        System.out.println(emp.getJoiningDate());

        date.setTime(0);

        System.out.println(emp.getJoiningDate());
    }
}