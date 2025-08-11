package Collections;
import java.util.*;
public class SetEg {

	public static void main(String[] args) {
	    // Treeset example
		// contains no duplicate elements
		// at most one null element
		// non synchronized
		// data is displayed in ascending order
		// operations are faster than the lists interface
		Set<String> st = new TreeSet<String>();
		st.add("Orange");
		st.add("Banana");
		st.add("grapes");
		st.add("apple");
		st.add("pineapple");
		st.add("grapes");
		st.add("null");
		
		
		
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st);
		System.out.println(st.add("King"));
		System.out.println(st);
		System.out.println(st.size());
		
		

	}

}
