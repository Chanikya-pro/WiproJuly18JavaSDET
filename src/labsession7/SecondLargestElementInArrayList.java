package labsession7;
import java.util.*;
public class SecondLargestElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 40, 30, 20, 50));

        if (list.size() < 2) {
            System.out.println("Not enough elements");
            return;
        }

        Set<Integer> set = new TreeSet<>(list);
        List<Integer> sortedList = new ArrayList<>(set);

        int secondLargest = sortedList.get(sortedList.size() - 2);
        System.out.println("Second Largest Element: " + secondLargest);
	}
}



