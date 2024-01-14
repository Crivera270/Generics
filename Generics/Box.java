package Generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
private List<T> items;

public Box() {
	this.items = new ArrayList<>();
}
public void additem(T t){
    this.items.add(t);
}
@Override
public String toString() {
	return "Box [items=" + items + "]";
}
	
	
}
