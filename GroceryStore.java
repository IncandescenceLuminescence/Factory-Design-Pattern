package csce247.assignments.factory;
public class GroceryStore {	
	public Cereal orderCereal(String type) {
		Cereal cereal=null;
		if(type.equals("forsted flakes"))
			cereal=new FrostedFlakes();
		else if(type.equals("lucky charms"))
			cereal=new LuckyCharms();
		else if(type.equals("fruit loops"))
			cereal=new FruitLoops();	
		else
			return null;
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		return cereal;
	}
}
