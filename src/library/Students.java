package library;

public class Students implements Cloneable {
	
	int id = 110;
	
	public static void main(String[] args) throws Exception {
		
		Students s1 = new Students();
		
		Students s2 = (Students) s1.clone();
		
		System.out.println(s2.id);
		
	}

}
