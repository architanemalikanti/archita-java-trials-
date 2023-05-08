package architaTrials.Demos;

public class House {
	
	protected int nbds; //number beds, >=0
	protected int b;
	
	public House() {
		
	}
	
	public House(int b1, int b2) {
		nbds = b1;
		b = b2;
	}
	
	//**sets number of bedrooms to b*/
	public void setBeds(int b) {
		
		this.nbds = b;
		
	}

}
