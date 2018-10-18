package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DessertShoppeTest {

	@Test
	public void testCents2dollarsAndCents() {
		DessertItem d1 = new IceCream("d1", 150);
		assertEquals("d1's cost should be 1.50.", String.valueOf(1.50),
				DessertShoppe.cents2dollarsAndCents(d1.getCost()));
	}

}
