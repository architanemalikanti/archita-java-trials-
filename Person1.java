package architaTrials.Demos;

public class Person1 {
	
	
	public int tester(int i) {
		assert(i>1);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 obj = new Person1();
		System.out.println(obj.tester(0));
		

	}

}
