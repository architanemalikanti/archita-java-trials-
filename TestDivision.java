package architaTrials.exceptions;

public class TestDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Division d = new Division();
		
		Integer answer = d.divide(4, 0);
		System.out.println(answer);
	}

}