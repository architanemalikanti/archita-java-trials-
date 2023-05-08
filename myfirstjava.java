package architaTrials.recursion;


public class myfirstjava {
	
		public static void main(String args[]) {
			long m = myfirstjava.factorial(4);
			System.out.println(m);
			
		}

		public static long factorial(int n) {
			int p = 1;
			if(n == 0) {
				return 1;
			}else {
				p = (int) (n*factorial(n-1));
				return p;
			}
			
			
		}//end method
		
		
		 public static String formatwith(String pattern,
				 String argument1, String argument2) {
			 
			 return null;
			 
		 }
		 public static String formatwith(String pattern,
				 String argument1, String argument2,String argument3) {
			 
			 return null;
			 
		 }
		 
		 public static String formatwith(String pattern,
				 String argument1, String argument2,String argument3, String arg4) {
			 
			 return null;
			 
		 }
		
	    public static String format(String pattern,
                String... arguments) {
	    	i
	    	return null;
	    }
		

	}


