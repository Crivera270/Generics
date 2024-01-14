package Generics;

public class Veggies extends Food {
	private String name;
	private double weight;
	private String color;
	
	
	
	public Veggies(String name, double weight, String color) {
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
		return "Veggies [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}

	
	
	
	
}
