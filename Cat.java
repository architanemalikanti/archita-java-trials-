package architaTrials.project;

import java.util.Date;

public class Cat implements Animal{
	
	//cat class variables 
	protected String furColor; 
	protected String eyeColor; 
	protected String name;
	protected Date dateOfBirth;
	protected int age;
	protected char gender;
	protected double whiskerCount;
	
	
	//default constructor
	public Cat() {
		
	}
	
	//parameterized constructor
	public Cat(String furColor, String eyeColor, String name, Date dateOfBirth, int age,char gender, double whiskerCount) {
		this.furColor = furColor;
		this.eyeColor = eyeColor;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;	
		this.whiskerCount = whiskerCount;
	}
	
	//overridden methods from interface
	@Override
	public void sleep() {
		System.out.println("zzz");
	}
	
	@Override
	public void drinkWater() {
		System.out.println("slurp slurp");
	}
	
	
	
	//getter methods:
	@Override
	public Date getDOB() {
		return this.dateOfBirth;
	}
	
	@Override 
	public void getName(String name) {
		System.out.println("the cat's name is "+ this.name);
	}
	
	@Override
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getEyeColor() {
		return this.eyeColor;
	}
	
	public String getFurColor() {
		return this.furColor;
	}
	
	
	//setter methods
	public void setDOB(Date obj) {
		this.dateOfBirth = obj;
	}
	
	public void setWhiskerCount(double w) {
		this.whiskerCount = w;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void getGender(char c) {
		this.gender = c;
	}
	
	public void setEyeColor(String c) {
		this.eyeColor = c;
	}
	
	public void setFurColor(String g) {
		this.furColor = g;
	}
	
	
	

}
