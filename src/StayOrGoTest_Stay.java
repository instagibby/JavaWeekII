import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StayOrGo;

public class StayOrGoTest_Stay {

	String message = "Stay";
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStay() {
		assertEquals(message, StayOrGo.ShouldI(1));
	}
	
}
