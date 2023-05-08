package architaTrials.inheritance;

public class A extends B{
	
	//i want to override the method in class B. (p)
	
	//this method is overridden because it has the same
	//method access modifier, return type, name, and
	//parameter type. 
	//the method just has different implementation
	//(that is, different code in the method body. 
	public void p(double i) {
		System.out.println("inside A in p method" + i);
	}
	
	//now, i want to overload the previous method. 

	public void p(int i) {
		System.out.println(i + 1);
	}
	
	
	
}