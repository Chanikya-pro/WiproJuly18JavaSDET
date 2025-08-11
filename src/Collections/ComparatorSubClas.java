package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubClas implements Comparator<Employee> {
        public int compare(Employee e1,Employe e2) {
				return e2.name.compareTo(e1.name);//descendingorder
					
				}
				
			
		public static void main(String[] args) {
			List<employee> employee=new ArrayList<>();
			employee.add(new employee(103,"Ravi"));
			employee.add(new employee(101,"Amit"));
			employee.add(new employee(102,"Raju"));
			employee.add(new employee(104,"sai"));
			Collections.sort(employee,new comparatorsubclass());
			for (employee emp:employee) {
				System.out.println(emp);
			}
		 
		}
		}

	}

}
