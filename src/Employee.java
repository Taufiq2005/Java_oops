final class Employee {

    private final java.util.Date joiningDate;

    public Employee(int id, String name, java.util.Date joiningDate) {
    	
        this.joiningDate = new java.util.Date(joiningDate.getTime());
        
    }

    public java.util.Date getJoiningDate() {
    	
        return new java.util.Date(joiningDate.getTime());
    }
    
}
