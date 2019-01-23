import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StayOrGo;

public class StayOrGoTest_Go {

	String message = "Go";
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testGo() {
		assertSame(message, StayOrGo.ShouldI(0));
	}

}
