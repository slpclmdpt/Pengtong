package Assignment5;

public class Candy extends DessertItem {
	private float weight;
	private int pricePerPound;

	public Candy(String name, float weight, int price) {
		this.name = name;
		this.weight = weight;
		this.pricePerPound = price;
	}

	@Override
	public int getCost() {
		return Math.round(this.weight * this.pricePerPound);
	}

	public String getWeight() {
		return String.format("%.2f", weight);
	}

	public int getPricePerPound() {
		return pricePerPound;
	}

}
