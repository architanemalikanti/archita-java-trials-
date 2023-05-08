package architaTrials.interfaces;

abstract public class Shape {

	private String color;
	private boolean filled;
	
	//constructor
	public Shape() {
		
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//methods
	public String getColor() {
		return this.color;
	}
	
	public boolean getFilled() {
		return this.filled;
	}
	
	abstract protected double getArea();
	
	abstract protected double getPerimeter();
	
}
