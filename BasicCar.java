package creational.Prototype._03;

public abstract class BasicCar implements Cloneable {
	protected String modelName;
	protected double price;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar) super.clone();
	}
}

class Ford extends BasicCar {
	public Ford(String modelName, double price) {
		this.modelName = modelName;
		this.price = price;
	}

	public Ford clone() throws CloneNotSupportedException {
		return (Ford) super.clone();
	}

	@Override
	public String toString() {
		return "Ford [modelName=" + modelName + ", price=" + price + "]";
	}

}

class Nano extends BasicCar {
	public Nano(String modelName, double price) {
		this.modelName = modelName;
		this.price = price;
	}

	public Nano clone() throws CloneNotSupportedException {
		return (Nano) super.clone();
	}

	@Override
	public String toString() {
		return "Ford [modelName=" + modelName + ", price=" + price + "]";
	}
}
