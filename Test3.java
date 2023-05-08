package architaTrials.IOexceptions;

public class Test3 {
	public static void main(String[] args) throws IOException {
		
		try (DataOutputStream output = new DataOutputStream (new FileOutputStream("t.dat")); ) {
			output.writeInt(1234); output.writeInt(5678); output.close();
} 
}
}