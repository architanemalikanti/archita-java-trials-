package architaTrials.interfaces;

public class TesterShape {

	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		
		Rectangle obj2 = new Rectangle(3, 2);
		System.out.println(equalArea(obj1, obj2));

	}
	
	public static boolean equalArea(Shape obj1, Shape obj2) {
		if(obj1.getArea() == obj2.getArea()) {
			return true;
		}else {
			return false;
		}
	}

}
