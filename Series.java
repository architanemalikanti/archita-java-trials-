package architaTrials.recursion;

public class Series {
	
	public static int numTimesCalled = 0;
	
	public  double series1(double i) {
		
		if(i > 0) {
			numTimesCalled++;
			return ((i/(i+1)) + series1(i-1));
			
		}else {
			numTimesCalled++;
			return 0.0;
			
		}
	}

}
