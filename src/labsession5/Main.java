package labsession5;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(10, 5);
		Shape circle = new Circle(7);
		Shape Triangle = new Triangle(6,4);
		
		System.out.println("Area of Rectangle :" + rectangle.getArea());
		System.out.println("Area of Cricle :" + circle.getArea());
		System.out.println("Area of Triangle :" + Triangle.getArea());

	}

}
