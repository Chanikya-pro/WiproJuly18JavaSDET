package labsession5;

public class Triangle implements Shape{
	private double height;
	private double base;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double getArea() {
		return 0.5*base*height;
	}

}
