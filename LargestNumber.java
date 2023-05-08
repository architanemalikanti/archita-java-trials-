package architaTrials.interfaces;
import java.util.ArrayList;
import java.math.*;

public class LargestNumber {

	
	public static void main(String args[]) {
		
		ArrayList<Number> list = new ArrayList<>();
		
		list.add(45); //add an integer
		list.add(3445.45); //add a double!
		
		//add a big Integer:
		list.add(new BigInteger("2488686959303020220200"));
		
		//add a big decimal
		list.add(new BigDecimal("2.102034594939200102300"));
		
		//largest number in the list:
		System.out.println("the largest number in the list is: "+getLargestNumber(list));
	}
	
	public static Number getLargestNumber(ArrayList<Number> list) {
		
		if(list == null || list.size() == 0) {
			return null;
		}
		
		Number number = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if(number.doubleValue()< list.get(i).doubleValue()) {
				number = list.get(i);
			}
		}
		return number;
		
	}
	



}
