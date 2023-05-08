package architaTrials.exceptions;

public class intDivide {
	
	
	public int intDivideMethod(int i, int j) {
		try {
			return i/j; //risky code
		}catch(Exception e) {
			return 0; //return zero if exception is thrown!
		}
	}

}
