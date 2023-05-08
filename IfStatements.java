package architaTrials.A1;

public class IfStatements {
	
	public static void main(String args[]) {
		System.out.println(median(4,0,8));
	}
	
	
	public static int median(int j, int k, int i) {
		
		if( ((j>k) && (j<i)) || ((j>i) && (j<k)) ) {
			return j;
		}
		else if( ((i>k) && (i<j)) || ((i>j) && (i<k)) ) {
			return i;
			
		}else {
			return k;
		}
		
		
	}

}
