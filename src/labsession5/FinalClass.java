package labsession5;

public class FinalClass {
	public void show() {
		System.out.println("Final class method");
	}
}
class Parent {
    final void display() {
        System.out.println("Final method in Parent");
    }
}
class Child extends Parent {

}
public class Main {
   public static void main(String[] args) {
		final int num = 100;
        FinalClass fc = new FinalClass();
        fc.show();

        Child ch = new Child();
        ch.display();
	}
}



	


