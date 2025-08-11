package Javapack;

public class StringBuffferEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		//mutable in nature
		//append
		sb.append("world");
		System.out.println(sb);
		
		//StringBuffer methods
		//reverse
		sb.reverse();
		System.out.println(sb);
		//isEmpty
		if(sb.length() == 0) {
			System.out.println("is Empty");
			
		}
		else {
			System.out.println("not empty");
		}
		//insert
		sb.insert(4, "v");
		System.out.println(sb);
		//delete
		sb.delete(4, 5);
		System.out.println(sb);
		//replace
		sb.replace(6, 8, "VI");
		System.out.println(sb);
		//substring
		sb.substring(3);
		System.out.println(sb);
		//charAt()
		char ch = sb.charAt(0);
		System.out.println(ch);
		//index of
		int idx = sb.indexOf("d");
		System.out.println(idx);
		//length
	
		System.out.println(sb.length());
		//reverse

		System.out.println(sb.reverse());
		
		
	}
}
		
	


