package Javapack;

public class ParameterizedMethods {
	//normal method with hard code
	
	
	
	
	//methods with parameters
	public void add1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ParameterizedMethods pm = new ParameterizedMethods();
		
		pm.add1(1,5);
		pm.add1(2,-3);
		pm.add1(-1,-10);
		pm.add1(-5,-12);

	}

}
