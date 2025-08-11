package Javapack;

public class MultilevelInPuppyClass extends MultilevelInDogClass{
	void weep() {
		System.out.println("Puppy weeps");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInPuppyClass p = new MultilevelInPuppyClass();
		
		p.eat();
		p.bark();
		p.weep();
		

	}

}
