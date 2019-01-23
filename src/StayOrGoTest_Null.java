import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StayOrGo;

public class StayOrGoTest_Null {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNull() {
		assertNull(StayOrGo.ShouldI(5));
	}
}
