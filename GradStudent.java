package architaTrials.Demos;

public class GradStudent extends Student{
	
	protected int marks;
	
	protected void randomMethod2() {
		System.out.println("method of grad student class");
	}
	

	public static void main(String[] args) {
		
		//simple way of making objects. 
		Person p = new Person();
		Student s = new Student();
		GradStudent g = new GradStudent();
		
		p = s;
		p = g;
		
		//Person class:
		Person obj = new Person();
		Person obj2 = new Student();
		Person obj3 = new GradStudent();
		
		//Student class:
		Student obj4 = new Student();
		Student obj5 = new GradStudent();
		
		//GradStudent class:
		GradStudent obj6 = new GradStudent();
		
		
		
		
		Person p2 = new Student();
		Student s2 = (Student)p2; //you're converting from person to student. so this is not possible. 
		
		
		
		/*class cast exception. i cannot cast the person class to student
		just because i typecasted a person object to student doesn't mean that
		it actually gets converted to a student. remember, a student object has more fields
		than a person object, so i'll be losing information in the process if i cast 
		a person object to student.  
		*/
		Student s2 = (Student)new Person();
		
		
		

	}

}
