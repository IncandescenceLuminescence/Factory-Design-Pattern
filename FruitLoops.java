package csce247.assignments.factory;
public class FruitLoops extends Cereal{
	public FruitLoops() {
		name="Fruit Loops";
		price=1.89;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain\n"
				+ "    - Shape into circles\n"
				+ "    - Randomly color circles\n"
				+ "    - Let circles dry");		
	}
}
