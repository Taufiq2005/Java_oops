package library;

class Student {
	
	int id = 110;
	String name = "Sara";
	
	public String toSring() {
		return id +""+ name;
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s);
			
	}

}
