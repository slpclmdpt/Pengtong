package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandyTest {

	@Test
	public void testGetCost() {
		assertEquals("2 lbs @ 1.5/lb. cost is 300 cents", 300, new Candy("c1", 2.0f, 150).getCost());
	}

	@Test
	public void testGetWeight() {
		assertEquals(String.format("%.2f", 2.5f), new Candy("c1", 2.5f, 300).getWeight());
	}

	@Test
	public void testGetPricePerPound() {
		assertEquals(200, new Candy("c1", 2.5f, 200).getPricePerPound());
	}

}
