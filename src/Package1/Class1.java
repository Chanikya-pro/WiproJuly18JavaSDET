package Package1;

public class Class1 {
	private static String employeeSalary = "5666744";
	private void fetchsalary() {
		System.out.println("The employee Salary is:" + employeeSalary);
	}
	public void display() {
		System.out.println("Hi I am Vicky");
	}
	//default variable
	int employeeId = 77887;
	void fetchemployeeID() {
		System.out.println("The employee Id is:" + employeeId);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		obj.display();
		obj.fetchsalary();
		obj.fetchemployeeID();

	}

}
