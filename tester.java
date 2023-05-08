package architaTrials.inheritance;

public class tester{
	String x;
	Integer i;
	public tester() {
		super();
	}
	
	public String abc() {
		return super.toString();
	}
	
	public static void main(String agrs[]) {
		
		tester lol = new tester();
		lol.x = "lol";
		lol.i = 1;
		System.out.println(lol.abc());
		System.out.println(lol.toString());

		tester xoxo = new tester();
		System.out.println(xoxo.abc());
		xoxo.x = "xoxo";
		xoxo.i = 2;
		System.out.println(xoxo.toString());

		
	}

	@Override
	public String toString() {
		return "tester [x=" + x + ", i=" + i + "]";
	}
	
}