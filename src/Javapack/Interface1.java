package Javapack;

public interface Interface1 {
	abstract void display();
	static void write( ) {
		System.out.println("Writing");
	}
	default void show() {
		System.out.println("Showing");
	}
	
	public static final String employeeName = "Vikram";
	int employeeId = 6969;
		
	

}
