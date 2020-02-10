package csce247.assignments.factory;
public class GroceryStore {
	private Cereal createCereal(String type) {
		Cereal cereal=null;
		if(type.equals("frosted flakes"))
			cereal=new FrostedFlakes();
		else if(type.equals("lucky charms"))
			cereal=new LuckyCharms();
		else if(type.equals("fruit loops"))
			cereal=new FruitLoops();
		return cereal;
	}	
	public Cereal orderCereal(String type) {
		Cereal cereal;
		cereal=createCereal(type);
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		return cereal;
	}
}
