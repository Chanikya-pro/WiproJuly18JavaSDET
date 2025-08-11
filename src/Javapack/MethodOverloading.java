package Javapack;

public class MethodOverloading {
	public void disc(int a) {
		System.out.println("Integer:" + a);
	}
	public void disc(double b) {
		System.out.println("Double:" + b);
	}
	public void disc(String s) {
		System.out.println("Integer:" + s);
	}
	public void disc(int a, int b){
		int c = a + b;
		System.out.println("Integer:" + c);
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.disc(5);
		obj.disc(5.5);
		obj.disc(1,2);
		obj.disc("hello");
	}
}
