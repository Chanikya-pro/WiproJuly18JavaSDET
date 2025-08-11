package Package1;

public class SamePackageNonSubClass {
	public void write() {
		System.out.println("writing in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj = new Class1();
		SamePackageNonSubClass obj1 = new SamePackageNonSubClass();
		obj1.write();
		obj.display();

	}
}

