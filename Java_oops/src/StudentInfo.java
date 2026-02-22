import jav.util.Scanner;

public class StudentInfo {
	
	int id;
	String name;
	int age;
	
	public StudentInfo(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class Student
{
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		StudentInfo s[] = new StudentInfo[3];
		
		for(int i=0;i<s.length;i++)
		{
			
			int id = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			s[i] = new StudentInfo(id,name,age);
		}
		
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}


