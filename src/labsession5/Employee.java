package labsession5;

public class Employee {
	    //  Private fields
	    private String name;
	    private int id;
	    private double salary;

	    //  Constructor
	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        setSalary(salary); // Validate salary using setter
	    }

	    //  Setter with validation
	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary for ID " + id + ". Salary must be positive.");
	            this.salary = 0; // Optionally set to 0 or leave unchanged
	        }
	    }

	    //  Getter
	    public double getSalary() {
	        return salary;
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name      : " + name);
	        System.out.println("Salary    : ₹" + salary);
	        System.out.println("----------------------------");
	    }

	    //  Main method to test the logic
	    public static void main(String[] args) {
	        // Test cases
	        Employee e1 = new Employee("Alice", 101, 50000);
	        Employee e2 = new Employee("Bob", 102, -10000);  // Invalid salary
	        Employee e3 = new Employee("Charlie", 103, 75000);

	        // Display details
	        e1.displayDetails();
	        e2.displayDetails(); // Salary should be 0 due to invalid input
	        e3.displayDetails();
	    }
}

	
	

	


