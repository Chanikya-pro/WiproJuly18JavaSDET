package labsession10;
import java.util.*;
public class TwoThreadsToPrintEvenAndOdd extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		Thread evenThread = new Thread(() -> {
			if(i % 2 == 0) {
				System.out.println("Number is Even");
			}
		});
		Thread oddThread = new Thread(() -> {
			if(i % 2 != 0) {
				System.out.println("Number is Odd");
			}
			
		});
		evenThread.run();
		oddThread.start();
		
		
	

	}

}
