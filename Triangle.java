package architaTrials.interfaces;

public class Triangle extends Shape{
	
	private int side1; 
	private int side2;
	private int side3;
	
	public Triangle(int side1, int side2, int side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	public double getArea() {
		return (this.side1)*(this.side2)*(this.side3);
	}
	
	public double getPerimeter() {
		return (double)((this.side1)+(this.side2)+(this.side3));
	}

}
