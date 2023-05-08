package architaTrials.interfaces;

public interface Person {
	
	 public default void reproduce() {
		System.out.println("reproduce");
	}
	 
	public void breathe();

}
