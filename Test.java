package architaTrials.inheritance;

class Test{
	public static void main(String args[]) {
		new Person1().printPerson();
		new Student1().printPerson();
		
		Circle circle = new Circle(1.0);
		Shape object1 = new Shape();
		
		System.out.println(circle instanceof Shape);
		System.out.println(object1 instanceof Shape);
		System.out.println(circle instanceof Circle);
		System.out.println(object1 instanceof Circle);
	}
}