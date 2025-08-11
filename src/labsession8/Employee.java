package labsession8;
import java.util.*;
public class Employee implements Comparable<Employee> {

	
		int id;
	    String name;

	    // Constructor
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Overriding compareTo to sort by name
	  
	    public int compareTo(Employee other) {
	        return this.name.compareTo(other.name); // Alphabetical order
	    }

	    // For displaying employee details
	   
	    public String toString() {
	        return id + " " + name;
	    }
}
public class SortEmployeesByName {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(102, "Vijay"));
        list.add(new Employee(101, "Amit"));
        list.add(new Employee(103, "Rahul"));

        // Sort employees by name
        Collections.sort(list);

        // Print sorted list
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
