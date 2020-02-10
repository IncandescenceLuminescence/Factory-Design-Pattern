package csce247.assignments.factory;
public class FrostedFlakes extends Cereal{
	public FrostedFlakes() {
		name="Frosted Flakes";
		price=2.99;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain\n"
				+ "    - Shape into flakes\n"
				+ "    - Sprinkle with frosting");
	}
}
