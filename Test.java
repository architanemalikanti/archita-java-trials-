package architaTrials.IOexceptions;
import java.io.*;

public class Test {
	
	public static void main(String[] args) {
	try {
	FileInputStream fis = new FileInputStream("test.dat");  
	}
	catch (IOException ex) {
	               ex.printStackTrace();
	             }
	catch (FileNotFoundException ex) { ex.printStackTrace();
	} }
	}

}
