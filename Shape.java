package architaTrials.inheritance;

public class Shape {
	private String color = "white";
	private boolean filled;
	
	// constructor
	//by putting a parametrized constructor
	//without explicitly defining a default constructor, 
	//you're forcing the child class to set certain properties
	//(which in this case are "color", and "filled" to certain
	//values. 
	
	public Shape() {
		
	}
	public Shape(String color, boolean filled) {
		System.out.println("parametrized cons got called");
		this.color = color;
		this.filled  = filled;
		
	}
	
//	public Shape() {
//		System.out.println("default cons for shape class has been called");
//	}
	
	//return color
	public String getColor(){
		return this.color;
	}
	
	//set a color
	public void setColor(String color){
		this.color = color;
	}
	
	//set whether its filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean getFilled() {
		return this.filled;
	}
	
	public void helloWorld() {
		System.out.println("Shape class helloWorld methods");
	}
	
	public String toString() {
		return super.toString();
	}
}