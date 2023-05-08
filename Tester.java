package architaTrials.recursion;

public class Tester {

	public static void main(String[] args) {
		
		Series obj = new Series();
		System.out.println(obj.series1(3));
		System.out.println("the number of times the method is called is "+ Series.numTimesCalled);
		
		Series.numTimesCalled = 0;
		Series obj2 = new Series();
		System.out.println(obj2.series1(5));
		System.out.println("the number of times the method is called is "+ Series.numTimesCalled);

		
		ReverseLOL obj3 = new ReverseLOL();
		
		System.out.println(obj3.reverse(15));
		

	}

}
