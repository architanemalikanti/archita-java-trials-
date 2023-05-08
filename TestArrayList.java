package architaTrials.inheritance;

import java.util.ArrayList;

public class TestArrayList{
	
	public static void main(String args[]) {
		
		//create a list to store cities
		
		ArrayList <String> list = new ArrayList<>();
		
		// Add some cities in the list
				
		// cityList now contains [London]
		list.add("london");
		
		// cityList now contains [London, Denver]
		list.add("denver");
		// cityList now contains [London, Denver, Paris]
		list.add("paris");
		// cityList now contains [London, Denver, Paris, Miami]
		list.add("miami");
		// Contains [London, Denver, Paris, Miami, Seoul]
		list.add("seol");
		// Contains [London, Denver, Paris, Miami, Seoul, Tokyo]
		list.add("tokyo");
		//list size. 
		int list_size = list.size();
		System.out.println("size of array is "+ list_size);
		//is miami in the list? denver? or is list empty?
		
		if(list.contains("miami")) {
			System.out.println("the list contains miami");
		}else if(list.contains("denver")) {
			System.out.println("the list contains miami");
		}else if (list.isEmpty()){
			System.out.println("the list is empty");
		}
		
		// Insert a new city at index 2
		
		list.add(2, "mumbai");
		
		// Remove a city from the list
		list.remove("miami");
		// Remove a city at index 1
		String s = list.remove(1);
		System.out.println("i just removed "+ s);
		// Display the contents in the list
		System.out.println(list.toString());
		// Display the contents in the list in reverse order
		
		for(int i = list.size()-1; i >=0; i--) {
			
			System.out.println(list.get(i)+ " ");
			
		}
		// Create a list to store two circles
		
		ArrayList <Circle> circleList = new ArrayList<>();
		
		// Add two circles
		
		
		circleList.add(new Circle(3.1));
		
		
		circleList.add(new Circle(3.2));
		
		
		// Display the area of the first circle in the list
		
		System.out.println(circleList.get(0).getArea());
		System.out.println((circleList.get(1)).getArea());
	}
	
}