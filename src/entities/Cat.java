package entities;

public class Cat extends Animal {
	// Lista attributi ESCLUSIVA DEI GATTI
	private boolean hasBoots;

	public Cat(String name, int age, boolean hasBoots) {
		super(name, age); // <-- Richiama il costruttore del padre
		this.hasBoots = hasBoots;
	}
}
