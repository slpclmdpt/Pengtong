package Assignment3_2;

public class HappyObject extends MoodyObject {
	protected String getMood() {
		return "happy";
	}

	public void expressFeelings() {
		System.out.println("hehehe...hahaha...HAHAHAHAHA!!!");
	}

	public String toString() {
		return " Subject laughs a lot\n";
	}
}
