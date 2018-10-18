package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IceCreamTest {

	@Test
	public void testGetCost() {
		IceCream i1 = new IceCream("i1", 150);
		assertEquals("i1's price is 150.", 150, i1.getCost());
	}

}
