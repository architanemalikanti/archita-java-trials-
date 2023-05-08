package architaTrials.exceptions;

public class TestCircleWithException {
	
	public static void main(String args[]) {
		try {
			CircleWithException c1 = new CircleWithException(5);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created:"+CircleWithException.getNumberOfObjects());
		
	}

}
