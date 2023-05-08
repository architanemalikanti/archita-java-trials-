package architaTrials.ListsStacksQueues;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1); // 1 is autoboxed to an Integer object
		arrayList.add(2);
		arrayList.add(3);
		 arrayList.add(1);
		 arrayList.add(4);
		 arrayList.add(0, 10);
		 arrayList.add(3, 30);
		
		 System.out.println("A list of integers in the array list:");
		      System.out.println(arrayList);
		      
		      LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		     linkedList.add(1, "red");
		           linkedList.removeLast();
		       linkedList.addFirst("green");
		   
		       System.out.println("Display the linked list forward:");
		          ListIterator<Object> listIterator = linkedList.listIterator();
		    while (listIterator.hasNext()) {}
		    
		    System.out.println("Display the linked list backward:");
		          listIterator = linkedList.listIterator(linkedList.size());
		     while (listIterator.hasPrevious()) {
		    	 System.out.print(listIterator.previous() + " ");
		     }
		    

	}

}