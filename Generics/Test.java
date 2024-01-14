package Generics;

public class Test {

	public static void main(String[] args) {
		
		//create a box that can hold all the different classes of food
		
		Box<Food> test = new Box<>();
		
		//create food items from the classes
		
		Fruit lemon = new Fruit("Lemon", 6.8, "red");
		Orange orange = new Orange("Honeybell", .4, "orange");
		Apple honeycrisp = new Apple ("honeycrisp", .3, "red");
		Lettuce iceberg = new Lettuce ("IceBerg", .4, "green");
		Roll ciabatta = new Roll ("ciabatta", 1.0, "lightbrown");
		
		
		//add the food items to the box
		test.additem(lemon);
		test.additem(orange);
		test.additem(honeycrisp);
		test.additem(iceberg);
		test.additem(ciabatta);
		
		//print out the contents of the box
		System.out.println(test);

		
		
		
	}
	
	
	
}
