package company;

public class Employee {
	public String employeeName;
    public int employeeId;
    public String employeeDepartment;
    
    public void displayInfo() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + employeeDepartment);
    }
}


