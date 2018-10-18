package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SundaeTest {

	@Test
	public void testGetCost() {
		Sundae s1 = new Sundae("s1", 150, "i1", 150);
		assertEquals("s1's costt is 150+ 150", 150 + 150, s1.getCost());

	}

}
