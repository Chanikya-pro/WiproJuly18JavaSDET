package labsession8;

public class Print1To100WithoutUsingLoop {

	public static void main(String[] args) {
		 print(1);
    }

    static void print(int num) {
        if (num <= 100) {
            System.out.println(num);
            print(num + 1); // recursion instead of loop
        }
    }
}
