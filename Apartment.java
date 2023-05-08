package architaTrials.Demos;

public class Apartment extends House{
	
	int floor; 
	Apartment downstairs;
	public static int numApts; 
	
	public Apartment() {
		numApts++;
	}
	
	public Apartment(int b2, int b1, Apartment ds, int floor) {
		numApts++;
		nbds = b2;
		b = b1;
		downstairs = ds;
		this.floor = floor;
	}
	
	@Override 
	public String toString() {
		return "haha";
	}
	
	public boolean isBelow() {
		return this == a.downstairs;
	}
	
	public static void main(String args[]) {
		
		House h = new House(1, 2);
		
		System.out.println(h.toString());
		
		Apartment a = new Apartment();
		
		System.out.println(a.toString());
		
		House h2 = a;
		
		System.out.println(h2.toString());
		
		//Apartment a2 = (Apartment) h;
		//System.out.println(a2.toString());
		
		
		
		Apartment obj = new Apartment();
		System.out.println(obj.toString()); //output: "haha"
		
		House obj2 = new House();
		System.out.println(obj2.toString()); //output: obj2's memory location
		
		
		House obj3 = new Apartment();
		System.out.println(obj3.toString()); //haha
		
		
		House obj4 = (House) new Apartment();

		System.out.println(obj4.toString()); //throw an exception
		
		
		
		
		
	}

}
