package Collections;
import java.util.*;
public class VectorsEg {

	public static void main(String[] args) {
		// growable array of objects
		// zero based index
		// maintains the insertion order
		// stores duplicate elements
		// capacity increment
		// null values allowed
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Vikram");
		vector.add("Vimal");
		vector.add("Vinay");
		vector.add("Vishal");
		vector.add("Veera");
		vector.add("Vicky");
		
		System.out.println(vector.get(2));
		System.out.println(vector.remove(2));
		System.out.println(vector);
		System.out.println(vector.indexOf("Veera"));
		System.out.println(vector.lastElement());
		System.out.println(vector.size());
		

	}

}
