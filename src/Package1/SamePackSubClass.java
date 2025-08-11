package Package1;

import Package1.Class1;
public class SamePackSubClass {
	public void read() {
		System.out.println("Reading in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackSubClass obj = new SamePackSubClass();
		obj.display();
		obj.read();

	}

}
