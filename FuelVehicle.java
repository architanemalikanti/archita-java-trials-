package architaTrials.interfaces;

public interface FuelVehicle extends Drivable{
	
	public void refuel(Object obj);
	
	public default void drive() {
		System.out.println("hiiii");
	}
	
}
