package labsession;

public class Rectangle extends Shape {
	double length = 5;
	double width = 10;
	
	void calculateArea() {
		double area = length * width;
		System.out.println("Area of rectangle :" + area);
	}
}
	


