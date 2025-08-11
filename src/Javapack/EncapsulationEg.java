package Javapack;

public class EncapsulationEg {
	//private fields - hidden from outside access
	private String name;
	private int age;
	// public getter method for name
	public String getName() {
		return name;
	}
	// public setter method for name
	public void setname(String name) {
		this.name = name;
	}
	//public getter method for age
	public int getAge() {
		return age;
	}
	//public setter method for age
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		EncapsulationEg obj = new EncapsulationEg();
		obj.setAge(23);
		obj.setname("harry");
		
				
		

	}

}
