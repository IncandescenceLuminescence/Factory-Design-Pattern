package csce247.assignments.factory;
public class LuckyCharms extends Cereal{
	public LuckyCharms() {
		name="Lucky Charms";
		price=1.55;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain\n"
				+ "    - Shape into circles\n"
				+ "    - Create marshmellow shapes\n"
				+ "    - Mix circles and marshmellows");
	}
}
