package architaTrials.generics;

public class GenericsClass <T extends Number>{
	
	
	public void display() {
		System.out.println("lol");
	}
	
	public static void main(String args[]) {
		GenericsClass<String> obj = new GenericsClass<>(); 
		//above doesn't work because u can only work with types that extend number
	}

}
