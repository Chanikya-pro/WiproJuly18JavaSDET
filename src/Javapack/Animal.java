package Javapack;

//super class
class An {
	public void eat() {
		System.out.println(" Animals eat food");
	}

}
// sub class1
class Dog extends An{
	public void bark() {
		System.out.println("Dog barks");
	}
}
//sub class 2
class cat extends An{
	public void meow() {
		System.out.println("cat meows");
	}
}
//sub class 3
class cow extends An{
	public void moo() {
		System.out.println("cow moo");
	}
	
}

//main class
public class Animal{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	    cat c = new cat();
	    c.eat();
	    c.meow();
	    
	    cow cw = new cow();
	    cw.eat();
	    cw.moo();
	}
}
