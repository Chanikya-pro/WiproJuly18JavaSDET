package Collections;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualsMethod {
	int id;
	String name;
	 EqualsMethod(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 
	 // overriding equal () to compare the object content
	 public boolean equals(Object obj) {
		 if (this == obj) return true; // same reference
		 if(obj == null || getClass() != obj.getClass()) return false;
		 
		 Employee other = (Employee)obj;
		 return this.id == other.id && this.name.equals(other.name);
	 }
	 
	 public int hashCode() {
		 return Objects.hash(id, name);
	 }
	 public String toString() {
			return id   + "_" + name;

		}

	public static void main(String[] args) {
		List<Employee> empoyees = new ArrayList<>();
		empoyees.add(new Employee (103, "Ravi"));
		empoyees.add(new Employee (101, "Amit"));
		empoyees.add(new Employee (102, "Zara"));
		empoyees.add(new Employee (102, "Zara"));
		empoyees.add(new Employee (104, "John"));
		
		//Collections.sort(empoyees, new ComparatorSubClass());
		for(Employee e: empoyees) {
			System.out.println(e);
		}
		

	}

}
