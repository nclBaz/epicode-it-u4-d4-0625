package entities;

public class Dog extends Animal {
	// Lista attributi ESCLUSIVA DEI CANI
	public boolean isACop;

	public Dog(String name, int age, boolean isACop) {
		super(name, age); // <-- Richiama il costruttore del padre
		this.isACop = isACop;
	}
}
