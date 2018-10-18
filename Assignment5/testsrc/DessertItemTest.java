package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DessertItemTest {

	@Test
	public void testGetName() {
		DessertItem d1 = new Cookie("d1", 2, 120);
		assertEquals("d1's name is d1.", "d1", d1.getName());
	}

	@Test
	public void testGetCost() {
		DessertItem d1 = new Cookie("d1", 2, 120);
		assertEquals("d1's cost is 120/12*2.", 120 / 12 * 2, d1.getCost());
	}

}
