package architaTrials.inheritance;

public class Arjuna extends Kunti{
	
	//variables
	private String skills;
	private int numberOfWives;
	private int childrenCount;
	
	//constructor
	
	public Arjuna(int childrenCount){
		this.childrenCount = childrenCount;
	}
	
	public Arjuna(String lineage, int childrenCount) {
		super(lineage, childrenCount);
	}
	
	public Arjuna(int numberOfWives, String skills) {
		this.skills = skills;
		this.numberOfWives = numberOfWives;
	}
}