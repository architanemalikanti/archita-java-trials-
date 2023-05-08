package architaTrials.inheritance;

public class DynamicBindingDemo{
	
	public static void main(String args[]) {
		m(new GradStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}
	
}

//my prediction of results:
//student
//student
//person
//java.lang.Object@123456
