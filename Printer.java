package architaTrials.generics;

import java.util.List;

public class Printer <T>{ //this class only works for Animals. 
	
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		 this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(this.thingToPrint);
	}
	
	public static void printList(List<? extends Animal>  myList) {
		System.out.println();
	}
	
	
	
	
	

	public static void main(String[] args) {
		
	
		
		
	}

}
