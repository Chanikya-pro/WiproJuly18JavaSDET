package labsession9;

import java.util.Scanner;

public class ReadInputFromJavaConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Enter age :");
		Integer age = sc.nextInt();
		
		System.out.println(name + age +  "years old");
		
       sc.close();
	}

}
