package architaTrials.exceptions;



class Division{

public Integer divide(int number1, int number2) throws ArithmeticException {
	Integer returnvalue = null;
//	try {
//		
//		returnvalue =  number1/number2;
//		//throw new IndexOutOfBoundsException();
//	} catch (java.lang.ArithmeticException e) {
		
		e.printStackTrace();
		System.out.println("looks like division by 0 case happened.");
		System.out.print("exception is" + e.getMessage());
		
		
		//returnvalue = 0; 
		
	} 
	catch (Exception fe) {
//		fe.printStackTrace();
	}
	return returnvalue;
	
	
}

}