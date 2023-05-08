package architaTrials.inheritance;
import java.util.ArrayList;

public class ArrayListStuff{
	
	public static int max(ArrayList <Integer> list) {
		
		
		int maxNum = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) > maxNum) {
				maxNum = list.get(i);
			}
		}
		
		return maxNum;
		
	}
	
	
}