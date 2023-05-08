package architaTrials.A1;

public class RegularPolygons {
	
	
	public static double returnArea(int n, int s) {
		
		return (1/4)*Math.pow(s, 2) * (n/Math.tan(Math.PI/n));
		
	}

	
}
