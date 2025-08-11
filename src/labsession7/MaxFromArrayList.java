package labsession7;
import java.util.*;
public class MaxFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		int max = Collections.max(arr);
		System.out.println(max);

	}

}
