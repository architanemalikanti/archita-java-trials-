import java.io.File;
import java.util.Scanner;
public class Directorysize{
	
	public static long getSize(File file) {
		
		long size = 0;
		
		if(file.isDirectory()) {
			File files = files.listFiles(); //return the array of file objects
			
			for(int i = 0; i < files.length; i++) {
				size = size + getSize(files[i]);
			}
			else {
				size = size + file.length();
			}
		}
		
		return size;
		
	}//end this method
}