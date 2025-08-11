package Collections;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorSubClass implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name); //ascending order
	}

	public static void main(String[] args) {
		List<Employee> empoyees = new ArrayList<>();
		empoyees.add(new Employee (103, "Ravi"));
		empoyees.add(new Employee (101, "Amit"));
		empoyees.add(new Employee (102, "Zara"));
		empoyees.add(new Employee (102, "Zara"));
		empoyees.add(new Employee (104, "John"));
		
		Collections.sort(empoyees, new ComparatorSubClass());
		for(Employee e: empoyees) {
			System.out.println(e);
		}
	}
}
