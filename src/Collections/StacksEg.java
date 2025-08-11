package Collections;
import java.util.*;
public class StacksEg {

	public static void main(String[] args) {
		// stack - represents a last-in-first-out(LIFO)
		// 1- based indexing
		Stack<String> st = new Stack<>();
		
		st.add("Vikram");
		st.add("Vinay");
		st.add("Vimal");
		st.add("Vishal");
		st.add("Vicky");
		
		System.out.println(st.empty());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.push("Priya"));
		System.out.println(st);
		System.out.println(st.search("Priya"));
		System.out.println(st);
		
		
	}

}
