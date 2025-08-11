package Collections;
import java.util.LinkedList;
import java.util.Deque;
public class DequeUsingLinkedList {

	public static void main(String[] args) {
		
				Deque<String> lang = new LinkedList<>();
				// add elements
				lang.add("Python");
				lang.add("Java");
				lang.add("C");
				lang.add("C++");
				System.out.println(lang);
				// access the first element
				System.out.println(lang.peek());
				//remove
				System.out.println(lang.remove("C"));
				System.out.println(lang);
				//poll
				System.out.println(lang.poll());
				System.out.println(lang);

	}

}
