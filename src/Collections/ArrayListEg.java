package Collections;
import java.util.ArrayList;
public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// insertion of the data
		al.add("Ravi");
		al.add("john");
		al.add("Vikram");
		al.add("Vicky");
		al.add("Sanjay");
		al.add("Ravi");
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Ravi"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al.set(4, "Chanikya"));
		System.out.println(al.size());
		

	}

}
