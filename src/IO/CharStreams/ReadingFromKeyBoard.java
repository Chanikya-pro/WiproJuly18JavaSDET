package IO.CharStreams;

import java.util.Scanner;

public class ReadingFromKeyBoard {

	public static void main(String[] args) {
		//creating the scanner class
		Scanner scn = new Scanner(System.in);
		// enter first name
		System.out.println("Enter the first name");
		int a = scn.nextInt();
		System.out.println("Enter the second number");
		int b = scn.nextInt();
		System.out.println("sum" + (a+b));
		scn.close();

	}

}
