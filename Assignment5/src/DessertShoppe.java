package Assignment5;

public class DessertShoppe {
	public static final String NAME = "Walmart Dessert Shoppe";
	public static final float TAXRATE = 0.065f;
	public static final int MAX_SIZEOFNAME = 22;
	public static final int MAX_WIDTHTODISPALY = 22;

	public static String cents2dollarsAndCents(int cents) {
		int dollar = cents / 100;
		double cent = cents % 100 / 100.00;
		return String.valueOf(dollar + cent);
	}

}
