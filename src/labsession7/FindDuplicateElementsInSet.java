package labsession7;
import java.util.*;
public class FindDuplicateElementsInSet {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(1,2,3,4,4,5,2);
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> unique = new HashSet<>();
		
	
		
	
		
		
		
	    for(Integer num : s) {
	    	
	    
	        if(!unique.add(num)) {
	    	    duplicates.add(num);
	        }
	        
	    }
	    System.out.println(duplicates);
	}
}
