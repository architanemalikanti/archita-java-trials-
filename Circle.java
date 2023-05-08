package architaTrials.inheritance;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super("brown", true);
	}
	
	public Circle(double r) {
		super("brown", true);
		this.radius = r;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super("brown", true);
		this.radius  = radius;
		setColor(color);
		setFilled(filled);
		
	}
	public String toString() {
		return super.toString();
	}
	
	public double getArea() {
		return 3.14*Math.pow(this.radius, 2);
	}
	
	
}