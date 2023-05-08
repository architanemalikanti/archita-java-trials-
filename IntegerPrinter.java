package architaTrials.generics;

public class IntegerPrinter {

	Integer thingToPrint;
	
	public IntegerPrinter(Integer thingToPrint) {
		 this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(this.thingToPrint);
	}
	
	
	public static void main(String[] args) {
		
		IntegerPrinter printer = new IntegerPrinter(23);
		
		printer.print();
		

	}

}
