package architaTrials.project;

public class Archita {
	
	private int age; 
	private String name = "Archita";
	private double gpa;
	private char year;
	
	//setter methods
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	public void setYear(char year) {
		this.year = year;
	}
	
	//getter methods
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public double getGPA() {
		return this.gpa;
	}
	public char getYear() {
		return this.year;
	}
	
	//toString:
	@Override
	public String toString() {
		return this.name;
	}
	
	//independant methods:
	
	
	
	

}
