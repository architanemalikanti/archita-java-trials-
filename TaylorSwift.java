package architaTrials.interfaces;

public class TaylorSwift implements Female{
	
	@Override
	public void reproduce() {
		System.out.println("hi");
	}
	
	@Override
	public void breathe() {
		System.out.println("im breathing haha");
	}
	
	public static void main(String args[]) {
		TaylorSwift obj = new TaylorSwift();
		obj.periods();
		obj.reproduce();
		obj.breathe();
	}
	
	
	
}
