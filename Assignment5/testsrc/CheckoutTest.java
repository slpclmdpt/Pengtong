package Assignment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckoutTest {

	@Test
	public void testNumberOfItems() {
		Candy c1 = new Candy("c1", 2.5f, 100);
		Cookie c2 = new Cookie("c2", 2, 150);
		Checkout ck = new Checkout();
		ck.enterItem(c1);
		ck.enterItem(c2);
		assertEquals("There are two itmes:c1 and c2.", 2, ck.numberOfItems());
	}

	@Test
	public void testEnterItem() {
		Candy c1 = new Candy("c1", 2.5f, 100);
		Checkout ck = new Checkout();
		ck.enterItem(c1);
		assertEquals("c1 was entered into the checkout list.", "c1", ck.items.elementAt(0).getName());
	}

	@Test
	public void testClear() {
		Candy c1 = new Candy("c1", 2.5f, 100);
		Checkout ck = new Checkout();
		ck.enterItem(c1);
		ck.clear();
		assertEquals("c1 was entered and the checkout list was cleared.", 0, ck.numberOfItems());
	}

	@Test
	public void testTotalCost() {
		Candy c1 = new Candy("c1", 2.5f, 100);
		Cookie c2 = new Cookie("c2", 2, 120);
		Checkout ck = new Checkout();
		ck.enterItem(c1);
		ck.enterItem(c2);
		assertEquals("c1 is 2.5 lbs @ 1.0/lb, c2 is 2 @ 120/dz., the total cost is 2.5 * 1.0 * 100 + 120 / 12 * 2.",
				Math.round(2.5 * 1.0 * 100 + 120 / 12 * 2), ck.totalCost());

	}

	@Test
	public void testTotalTax() {
		Candy c1 = new Candy("c1", 2.5f, 100);
		Cookie c2 = new Cookie("c2", 2, 120);
		Checkout ck = new Checkout();
		ck.enterItem(c1);
		ck.enterItem(c2);
		assertEquals("Total cost of c1 and c2 is 270, tax rate is 0.065, total tax is 270*0.065",
				Math.round(270 * 0.065), ck.totalTax());
	}

}
