package Assignment3_2;

// 4/5
public class Test {
	public static void main(String[] args) {
		PsychiatristObject psy = new PsychiatristObject();
		MoodyObject happyObject = new HappyObject();
		MoodyObject sadObject = new SadObject();
		psy.examine(happyObject);
		psy.observe(happyObject);
		psy.examine(sadObject);
		psy.observe(sadObject);
	}
}
