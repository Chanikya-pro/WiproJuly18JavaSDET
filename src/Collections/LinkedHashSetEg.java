package Collections;
import java.util.*;
public class LinkedHashSetEg {

	public static void main(String[] args) {
		// no duplicates are allowed
		// Insertion order
		// only one null is allowed
		// not synchronized
		// slightly  slower than hash set (order main)
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		lhs.add(1);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.contains(1));
		System.out.println(lhs.size());
		System.out.println(lhs.remove(null));
		System.out.println(lhs);
				
		
		
		
		
		
		

	}

}
