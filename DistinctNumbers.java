import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
	
	public static void main(String args[]) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter integers! last one ends w 0:");
		
		int value;
		
		do { //add value to the list if it hasn't
			//occured in the list yet. 
			value = input.nextInt();
			if(!(list.contains(value)) && value != 0) {
				list.add(value);
			}while(value != 0);
		}
	}
}