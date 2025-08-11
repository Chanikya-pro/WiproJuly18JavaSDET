package Javapack;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Vikram";
		String s2 = "Dhanush";
		//equals
		System.out.println(S1.equals(s2));
		// concatenation
		System.out.println(S1.concat(s2));
		//substring
		System.out.println(S1.substring(2));
		System.out.println(S1.substring(1, 3));
		//replace
		System.out.println(S1.replace("ik","gi"));
		System.out.println(S1.replaceAll(S1,"Kasthuri"));  //doubt
		//isEmpty
		System.out.println(S1.isEmpty());
		//ends with
		System.out.println(S1.endsWith("m"));
		//join
		String S3 = String.join("_","name","Vikram");
		System.out.println(S3);
		//compare to lexical graphical comparsion
		System.out.println(S1.compareTo(s2));
		//Split
		String text = "Java is a platform independent";
		String[] result = text.split(" ");
		for(String S : result) {
			System.out.println(S + ",");
		}
		
		

	}

}
