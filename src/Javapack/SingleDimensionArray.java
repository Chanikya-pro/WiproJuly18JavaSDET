package Javapack;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		String[] names = {"alice", "wonder", "charlie"};
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for(int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(a[1]);  // to access single element
		

	}

}
