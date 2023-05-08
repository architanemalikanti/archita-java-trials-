package architaTrials.ListsStacksQueues;
import java.util.*;
public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		Iterator<String> iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();

	}

}
