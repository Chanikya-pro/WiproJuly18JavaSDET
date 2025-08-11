package labsession;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5};
		int target = 3;
		boolean found = false;
		for(int i = 0; i <= a.length; i++) {
			if(a[i] == target) {
				System.out.println("Element " + target +  "found at index" + i);
				found = true;
				break;
			}
			
		}
		if(!found) {
			
		    System.out.println("Element is not found");

	}
	}
}


