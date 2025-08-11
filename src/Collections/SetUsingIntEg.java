package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetUsingIntEg {

	public static void main(String[] args) {
		Set<Integer> st = new TreeSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		st.add(6);
		st.add(7);
		st.add(7);
		
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st);
		System.out.println(st.add(10));
		System.out.println(st);
		System.out.println(st.size());

	}

}
