package architaTrials.Demos;
import static org.junit.Assert.*;

public class HouseTest {

	@Test
	public void setBeds() {
		House h = new House();
		h.setBeds(2);
		assertEquals(2, h.setBeds(8));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
