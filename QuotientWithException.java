package architaTrials.exceptions;

public class QuotientWithException {
	
	public static int quotient(int number1, int number2) {
		if(number2 == 0) {
			throw new ArithmeticException("divisor cannot be zero");
		}
		return number1/number2;
	}
	
	public static void main(String args[]) throws ArithmeticException {
		//try {
			int result = quotient(4, 0);
			System.out.println(result);
		//}
		//catch (ArithmeticException ex) {
		//	System.out.println("error- denominator is zero.");
		//}
	}

}
