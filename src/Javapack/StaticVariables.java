package Javapack;

public class StaticVariables {
	public static String studentName = "Vikram";
	public String college = "ANits";
	public static int studid = 123;
	
	

	public static void main(String[] args) {
		StaticVariables sv = new StaticVariables();
		//accessing the static variables
		System.out.println(studentName);
		System.out.println(studid);
		//access the non static variables
		System.out.println(sv.college);
		
		
	

		

	}

}
