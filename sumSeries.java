package architaTrials.recursion;

public class sumSeries {

	public static void main(String args[]) {
		sumSeries s = new sumSeries();
		
		System.out.println(s.recursiveCrap(4));
	}

	public float recursiveCrap(float i) {

		if (i > 0) {
			return (1 / i) + recursiveCrap(i - 1);
		}
		return 0;
	}
	
	
	

}// end class