package Generics;

public class Fruit extends Food{
	 private String name;
	 private double weight;
	 private String color;
	 
	  public Fruit(String name, double weight, String color) {
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
			return "Fruit [name=" + name + ", weight=" + weight + ", color=" + color + "]";
		}

	
	    
}
