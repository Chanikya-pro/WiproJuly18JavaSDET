package labsession7;
import java.util.*;
public class SortArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(1);
		arr.add(2);
		arr.add(71);
		
		Collections.sort(arr);
		System.out.println(arr);
		

	}

}
