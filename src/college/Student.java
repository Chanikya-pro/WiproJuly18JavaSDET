package college;

public class Student {
	private String studentName;
    private int studentId;
    private String studentDepartment;
    
    public Student(String name, int id, String dept) {
    	this.studentName = name;
        this.studentId = id;
        this.studentDepartment = dept;
    }
    
    public void displayInfo() {
    	System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Department: " + studentDepartment);
    }
}
    
    
