package architaTrials.recursion;

public class ReverseLOL {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numDigits(int p) {
		
		int numDigits1 = 0;
		
		while(p>0) {
			p = p/10;
			numDigits1++;
			
		}
		return numDigits1;
	}
	
	
	public double reverse(int i) {
		
		if(i > 0) {
			int num = i %10;
			
			return (num*Math.pow(10, numDigits(i)-1)) + reverse(i/10);
			
			
		}else {
			return 0;
		}
		
	}

}
