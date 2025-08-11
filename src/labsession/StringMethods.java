package labsession;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Core Java";
		String S2 = "Selenium";
		//equals
		System.out.println(S1.equals(S2));
		//concatenation
		System.out.println(S1.concat(S2));
		//contains
		System.out.println(S1.contains("J"));
		//substring
		System.out.println(S1.substring(4));
		System.out.println(S1.substring(1, 4));
		//replace
		System.out.println(S1.replace("Core", "Advanced"));
		//isEmpty
		System.out.println(S1.isEmpty());
		//ends with
		System.out.println(S1.endsWith("a"));
		//joins
		String S3 = String.join("_","name","Python");
		System.out.println(S3);
		//compare to 
		System.out.println(S1.compareTo(S2));
		//split
		String text = " Python is a Programming Language";
		String[] result = text.split(" ");
		for(String S4 : result) {
			System.out.println(S4 + ",");
		}

	}

}
