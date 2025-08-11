package Package2;
import Package1.Class1;
public class DiffPackSubclass {
	public void create() {
		System.out.println("creating in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffPackSubclass obj = new DiffPackSubclass();
		obj.create();
		obj.show();

	}

}
