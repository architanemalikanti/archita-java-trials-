package architaTrials.IOexceptions;

public class Test2 {
	
		public static void main(String[] args)
		throws java.io.IOException { try (java.io.PrintWriter output =
		new java.io.PrintWriter("t.txt"); ) { output.printf("%s", "1234"); output.printf("%s", "5678"); output.close();
		} }
		}


