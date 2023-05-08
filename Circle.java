package architaTrials.interfaces;

public class Circle extends Shape{

	private int radius;
	
	//constructor
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//implementation of abstract methods
	
	public double getArea() {
		return 3.14*Math.pow((this.radius), 2);
	}
	
	public double getPerimeter() {
		return 3.14*2*this.radius;
	}

}
