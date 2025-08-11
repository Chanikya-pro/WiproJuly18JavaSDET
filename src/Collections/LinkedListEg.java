package Collections;
import java.util.LinkedList;
public class LinkedListEg {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Ravi");
		l.add("john");
		l.add("Vikram");
		l.add("Vicky");
		l.add("Sanjay");
		l.add("Ravi");
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.indexOf("Ravi"));
		System.out.println(l.isEmpty());
		System.out.println(l.remove(4));
		System.out.println(l.set(4, "Chanikya"));
		System.out.println(l.size());
		System.out.println(l);
		

	}

}
