package architaTrials.inheritance;

public class TriangleTester{
	
	public static void main(String args[]) {
		
		Triangle one = new Triangle(3.0, 4.0, 5.0, "red", true);
		
		System.out.println(one.getFilled());
		
		System.out.println(one.getColor());
		
		System.out.println(one.getSide1());
		
		System.out.println(one.getSide2());
		
		System.out.println(one.getSide3());
	}
	
	
	
}