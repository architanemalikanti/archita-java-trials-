package architaTrials.Demos;

public class Whitehouse extends House{
	
	
	private static final Whitehouse instance = new Whitehouse();
	
	private Whitehouse() {
		
	}
	
	public static Whitehouse getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
