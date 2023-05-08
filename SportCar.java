package architaTrials.interfaces;

public class SportCar implements FuelVehicle{
	
	int i = GLOBAL_VALUE;
	
	@Override 
	public void drive() {
		System.out.println("vroom!");
	}
	
	
	@Override
	public void refuel(Object obj) {
		System.out.println("fuel the car");
	}
	
	
	
	

}

class MainInterfaceBaby{
	
	public static void main(String args[]) {
		
		//create an object of sportcar
		
		SportCar obj = new SportCar();
		
		obj.drive();
		obj.refuel(new SportCar());
		
		
		
		
	}
	
}