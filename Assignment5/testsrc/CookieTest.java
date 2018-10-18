package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CookieTest {

	@Test
	public void testGetCost() {
		Cookie c1 = new Cookie("c1", 2, 120);
		assertEquals("c1's price is 200 cent/dz. The cost of 2 cookies is 120/12*2.", 120 / 12 * 2, c1.getCost());
	}

	@Test
	public void testGetNumber() {
		Cookie c1 = new Cookie("c1", 2, 120);
		assertEquals("c1's number is 2.", 2, c1.getNumber());
	}

	@Test
	public void testGetPricePerDozen() {
		Cookie c1 = new Cookie("c1", 2, 120);
		assertEquals("c1's pricePerPound is 120.", 120, c1.getPricePerDozen());
	}

}
