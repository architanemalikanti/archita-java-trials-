package architaTrials.recursion;

public class sumSeries2 {
	
	public static float recursiveCrap2(float i) {
		if(i > 0) {
			return i/((2*i)+1) + recursiveCrap2(i-1);
		}
		return 0;
	}
}