package architaTrials.project;

import java.util.Date;

public class Tiger extends Cat{
	
	//instance variable of tiger
	private String breed;
	private boolean isWhite; 
	
	//default constructor of Tiger
	public Tiger(String breed, boolean isWhite) {
		super();
		
		this.breed = breed;
		this.eyeColor = "green";
		
		if(this.isWhite) {
			this.isWhite = isWhite;
		}else {
			this.furColor = "orange"; 
		}
		
	}
	
	//regular constructor for class tiger
	public Tiger(String furColor, String eyeColor, String name, Date dateOfBirth, int age,char gender, double whiskerCount, String breed, boolean isWhite) {
		super(furColor, eyeColor, name, dateOfBirth, age, gender, whiskerCount);
		this.breed = breed;
		this.isWhite = isWhite;
	}
	
	
	//getter methods:
	public String getBreed() {
		return this.breed;
	}
	
	public boolean getIsWhite() {
		return this.isWhite;
	}
	
	//setter methods:
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void getIsWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//methods
	@Override
	public String toString() {
		if(isWhite) {
			return "the tiger is white";
		}
		return "the tiger is orange";
		 
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
