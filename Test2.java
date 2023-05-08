package architaTrials.inheritance;

class Circle1{
	double radius;
	
	

	@Override
	public boolean equals(Object o) {
		return this.radius == ((Circle)o).radius;
	}
}

class Test2{
	public static void main(String args[]) {
		Object circle1 = new Circle();
		Object circle2 = new Circle();
		System.out.println(circle1.equals(circle2));
	}
}