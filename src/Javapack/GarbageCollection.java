package Javapack;

public class GarbageCollection {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollection obj = new GarbageCollection();
		//by nulling the refernce
		obj = null;
		//by assigining a reference to another object
		GarbageCollection obj1 = new GarbageCollection();
		GarbageCollection obj2 = new GarbageCollection();
		obj1 = obj2;
		
		//out of scope
		GarbageCollection obj4 = new GarbageCollection();
		
		//System.gc();  (or)
		Runtime.getRuntime().gc();
		
		
		

	}

}
