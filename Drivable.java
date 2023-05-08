package architaTrials.interfaces;

public interface Drivable{
	
	int GLOBAL_VALUE = 42;
	public default void drive(){
		System.out.println("LOL IM DRIVING");
	}
	
	public static void fuel() {
		System.out.println("drivable being called");
	}
	
	
	
	
	
}
