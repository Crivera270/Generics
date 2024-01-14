package Generics;

public class Bread extends Food{
	private String name;
	private double weight;
	private String color;
	
	
	
	public Bread(String name, double weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Bread [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}

	
}
