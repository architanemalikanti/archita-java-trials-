package architaTrials.exceptions;

public class Test2 {
	
	public static void main(String args[]) {
		
		try {
			
			double f = 1.0/0;
			System.out.println(f);
		} catch(Throwable ex) {
			System.out.println("lol ur not allowed to do 1/0!");
		}
	}

}
