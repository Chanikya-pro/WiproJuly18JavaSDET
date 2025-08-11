package Collections;
import java.util.HashSet;
public class HashSetEg {

	public static void main(String[] args) {
		// no duplicate elements allowed
		// no guarenteed order
		// multiple nulls are allowed but it prints only once
		//non synchronized
		// operations are faster than lists
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Vikram");
		hs.add("Vimal");
		hs.add("Vinay");
		hs.add("Vishal");
		hs.add("Vikas");
		hs.add("Vikram");
		hs.add("null");
		hs.add("null");
		
		System.out.println(hs);
	
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println(hs.contains("Vikram"));
		System.out.println(hs.remove("Vikas"));
		System.out.println(hs);
		System.out.println(hs.add("King"));
		System.out.println(hs);
		System.out.println(hs.size());
		

	}

}
