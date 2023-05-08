package architaTrials.interfaces;

//animal interface
interface Animal{
	
	
	//abstract methods of the interface
	public void animalSound();
	public void run();
	
	
}//end animal interface

//Pig "implements" animal interface

class Pig implements Animal{
	
	public void animalSound() {
		System.out.println("oink oink");
	}
	
	public void run() {
		System.out.println("run!");
	}
	
	public void sleep() {
		System.out.println("ZZZ");
	}
	
	
	
}//end Pig


//main class

class Main{
	
	public static void main(String args[]) {
		Pig myPig = new Pig();
		
		myPig.animalSound();
		myPig.run();
		myPig.sleep();
	}
	
	
	
}