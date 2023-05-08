package architaTrials.exceptions;
import java.util.*;
public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.print("enter an integer");
				int number = input.nextInt();
				/*if number is not an integer, then it will exit out of try block and go to 
				catch block*/
				
				//display the result. 
				System.out.println("entered number is "+ number);
				continueInput = false;
				
			} //end try
			catch (InputMismatchException ex) {
				System.out.println("try again, input isn't an integer.");
				input.nextLine(); //discard input 
				
			} //end catch.
		}//end do
		while(continueInput);

	}

}
