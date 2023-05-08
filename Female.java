package architaTrials.interfaces;

public interface Female extends Person{
	
	public default void periods() {
		System.out.println("periods");
	}
	
	@Override
	public default void breathe() {
		System.out.println("im breathing");
	}
	 
	

}
