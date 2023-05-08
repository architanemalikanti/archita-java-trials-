package architaTrials.inheritance;

public class ConsCheck {
	
	public int x;
	public int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsCheck x =  new ConsCheck();

	}
	
	public ConsCheck (int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public String toString() {
		return "hi";
	}
	
	public String toString(int i) {
		Integer x = i;
		return x.toString();
	}

}
