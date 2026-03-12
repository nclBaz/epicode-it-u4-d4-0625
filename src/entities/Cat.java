package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Lista attributi ESCLUSIVA DEI GATTI
	private boolean hasBoots;

	public Cat(String name, int age, boolean hasBoots) {
		super(name, age); // <-- Richiama il costruttore del padre
		this.hasBoots = hasBoots;
	}

	public boolean hasBoots() {
		return hasBoots;
	}

	public void setHasBoots(boolean hasBoots) {
		this.hasBoots = hasBoots;
	}

	@Override
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più precisi non sono un Animal ma un Cat");
	}

	@Override
	public void makeSound() {
		System.out.println("MEOW!");
	}

	public void sayYourName(String saluto) { // OVERLOAD
		System.out.println(saluto);
		this.sayYourName();
	}

	@Override
	public String toString() {
		return "Cat{" +
				"hasBoots=" + hasBoots +
				"} " + super.toString();
	}

	@Override
	public void jump(int amount) {
		System.out.println("Gatto salta " + amount + " cm");
	}
}
