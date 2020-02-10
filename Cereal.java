package csce247.assignments.factory;
public abstract class Cereal {
	protected String name;
	protected double price;
	public void prepare() {
		System.out.println("Preparing the "+name);
	}
	public void boxCereal() {
		System.out.println("Drawing fun pictures of "+name+" on the box\n"
				+ "Pouring the "+name+" into the box");		
	}
	public void priceCereal() {
		System.out.println("Putting price tags of $"+price+" on the "+name+" box");		
	}
}
