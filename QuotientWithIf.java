package architaTrials.exceptions;
import java.util.Scanner;

public class QuotientWithIf{
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter 2 integers
		
		System.out.print("Enter two integers: "); 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number2 != 0) {
			System.out.println(number1/number2);
		}else {
			System.out.println("divisor cannot be 0");
		}
		
	}
}