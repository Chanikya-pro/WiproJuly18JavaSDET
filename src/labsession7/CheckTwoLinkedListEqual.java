package labsession7;
import java.util.*;
public class CheckTwoLinkedListEqual {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l2.add(1);
		l2.add(5);
		l2.add(3);
		l2.add(4);
		System.out.println(l.equals(l2));
		

	}

}
