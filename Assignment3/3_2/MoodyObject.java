package Assignment3_2;

public abstract class MoodyObject {
	protected abstract String getMood();

	protected abstract void expressFeelings();

	// try "I feel " + getMood() + " today!"
	public void queryMood() {
		// happy
		if (this.getMood() == "happy") {
			System.out.println("I feel happy today!\n");
		}
		// sad
		else {
			System.out.println("I feel sad today!\n");
		}
	}

}
