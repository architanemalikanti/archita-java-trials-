package architaTrials.IOexceptions;
import java.io.*;


public class TestFileStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		try {
			//create an output stream to the file 
			FileOutputStream output = new FileOutputStream("temp.dat");
			
			//write values to the file!
			for(int i = 1; i <= 10; i++) {
				output.write(i);
			}
		}
		try {
			//create an input stream for the file "temp.dat"
			FileInputStream input = new FileInputStream("temp.dat");
			
			//read values from the file, and display them in the console.
			
			int value;
			
			while((value = input.read()) != -1) {
				System.out.println(value + " ");
			}
		}
		
		
		

	}

}
