package creational.Prototype._03;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		CachedCar.loadCache();
		BasicCar car01 = CachedCar.getCar("Ford01");
		System.out.println(car01);
		BasicCar car02 = CachedCar.getCar("Nano01");
		System.out.println(car02);
	}
}
