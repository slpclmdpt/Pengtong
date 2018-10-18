package Assignment5;

import java.util.Vector;

public class Checkout {

	public Vector<DessertItem> items;

	public Checkout() {
		this.items = new Vector<DessertItem>();
	}

	public int numberOfItems() {
		return this.items.size();
	}

	public void enterItem(DessertItem item) {
		this.items.add(item);
	}

	public void clear() {
		this.items.clear();
	}

	public int totalCost() {
		int total = 0;
		for (DessertItem item : this.items) {
			total += item.getCost();
		}
		return total;
	}

	public int totalTax() {
		return Math.round(totalCost() * DessertShoppe.TAXRATE);
	}

	@Override
	public String toString() {
		String str = "     " + DessertShoppe.NAME + "\n     ----------------------\n";
		for (DessertItem item : items) {
			// ice cream
			if (item instanceof Sundae) {
				str += "\n" + String.format("%-22s", item.getName().split("\\n")[0]) + "\n"
						+ String.format("%-22s", item.getName().split("\\n")[1])
						+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			// sundae
			else if (item instanceof IceCream) {
				str += "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			// cookie
			else if (item instanceof Cookie) {
				str += "\n"
						+ String.format("%-22s", ((Cookie) item).getNumber() + " @ "
								+ DessertShoppe.cents2dollarsAndCents(((Cookie) item).getPricePerDozen()) + " /dz.")
						+ "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			// candy
			else {
				str += "\n"
						+ String.format("%-22s", ((Candy) item).getWeight() + " lbs. @ "
								+ DessertShoppe.cents2dollarsAndCents(((Candy) item).getPricePerPound()) + " /lb.\n")
						+ String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
		}
		str += "\n\n" + String.format("%-22s", "Tax")
				+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(totalTax())) + "\n"
				+ String.format("%-22s", "Total Cost")
				+ String.format("%10s", DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax())) + "\n\n";
		return str;
	}
}
