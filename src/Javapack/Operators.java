package Javapack;

public class Operators {

	public static void main(String[] args) {
		// unary operators
		int i = 11;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		
        //relational operators
		int a = 10;
		int b = 20;
		if(a == b) {
			System.out.println("true");
		}
		
		if(a != b) {
			System.out.println("true");
			
		}
		if(a > b) {
			System.out.println("greater");
			
		}
		if(a < b) {
			System.out.println("smaller");
			
		}
		if(a >= b) {
			System.out.println("greater than or equaltoo");
			
		}
		if(a <= b) {
			System.out.println("smaller than or equaltoo");
		}
			
		
        //logical operators
		int v = 5, w = 10;        //&& AND
		if(v < w && w > 5) {
			System.out.println(" both conditions are true");
		}
		int marks = 50;          // || OR
		if(marks > 10 || marks > 100) {
			System.out.println("condition is true");
			
		}
		boolean isRaining = true;
		if(!isRaining) {
			System.out.println("You can go out");
		}
		
		 //assignment operators   // = += -=
		 int m = 20;
		 int l = 54;
		 
		 m+= 3;
		 System.out.println(m);
		 
		 m -= 4;
		 System.out.println(m);
		 
		 
		 
		 // ternary operators
		 // condition ?  expression_if_true: expression_if_false
		 int v1 = 2, y2 = 5;
		 int sum = v1>y2 ? true : false
		 
		 
		 
	}
    
}
