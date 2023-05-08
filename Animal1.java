package architaTrials.interfaces;

abstract class Animal1 {
	
	//define the abstract move method. 
	
	abstract void move();
	protected int i; 
	
	
}

abstract class Pet extends Animal1{
	
	public Pet(int i) {
		this.i = 5;
	}
	
}

class Dog1 extends Pet{
	
	public Dog1(int i) {
		super(i);
	}
	@Override
	public void move(){
		System.out.println("move");
	}
	
	public int getI() {
		return this.i;
	}

}
