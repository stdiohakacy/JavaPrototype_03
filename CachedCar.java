package creational.Prototype._03;

import java.util.Hashtable;

public class CachedCar {
	public static Hashtable<String, BasicCar> listCar = new Hashtable<String, BasicCar>();

	public static void loadCache() {
		Ford ford01 = new Ford("Ford01", 100000);
		Ford ford02 = new Ford("Ford02", 200000);

		Nano nano01 = new Nano("Nano01", 300000);
		Nano nano02 = new Nano("Nano02", 400000);

		listCar.put(ford01.getModelName(), ford01);
		listCar.put(ford02.getModelName(), ford02);
		listCar.put(nano01.getModelName(), nano01);
		listCar.put(nano02.getModelName(), nano02);
	}

	public static BasicCar getCar(String modelName) throws CloneNotSupportedException {
		BasicCar cachedCar = listCar.get(modelName);
		return (BasicCar) cachedCar.clone();
	}
}
