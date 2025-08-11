package Javapack;

public class Student {
	String name;
	int rollNumber;
	String course;
	
	public Student(String name, int rollNumber, String course) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		
		
	}
	public void displayInfo() {
		System.out.println("Student Information:");
		System.out.println("Name     : " + name);
		System.out.println("rollNumber     : " + rollNumber);
		System.out.println("course     : " + course);
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Anjali Sharma", 101, "Computer Science");
		s1.displayInfo();
		
	}

}
