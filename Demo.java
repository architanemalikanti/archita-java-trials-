package architaTrials.inheritance;


class Father{
	public Father(){
		System.out.println("father cons invoked.");
	}
	public String show1() {
		return "show1 method of class father";
	}
}

class Daughter extends Father{
	public Daughter() {
		super();
	}
	public String show2() {
		return "show2 method of class daughter";
	}
}

public class Demo{
	
	public static void main(String args[]) {
		Daughter archita1 = new Daughter();
		Father nanna = archita1;
		Daughter archita = new Daughter();
		
		Father nanna1 = new Daughter();
		//Daughter archita1 = new Father();
		
		System.out.println(nanna1.show1());
		
		//archita = nanna;
		archita = (Daughter) nanna;
		//for an object to be casted daughter, 
		//u must make sure 'nanna''s actual type is of 
		//type daughter.
		
		if(!(nanna instanceof Daughter)) {
			System.out.println("nanna object's actual type is 'Father', not 'daughter'.");
		}
		
		if(nanna1 instanceof Daughter) {
			archita = (Daughter) nanna1;
		}
		
		archita.show2();
		archita.show1();
				
		


	}
	
}