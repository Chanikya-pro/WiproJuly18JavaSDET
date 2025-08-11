package Package2;
import Package1.Class1;
public class DiffPackNonSubclass {
	public void print() {
		System.out.println("printing the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		DiffPackNonSubclass obj1 = new DiffPackNonSubclass();
		obj.();
		obj1.display();

	}

}
