package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {
	// Lista attributi ESCLUSIVA DEI CANI
	public boolean isACop;

	public Dog(String name, int age, boolean isACop) {
		super(name, age); // <-- Richiama il costruttore del padre
		this.isACop = isACop;
	}

	@Override
	public void makeSound() {
		System.out.println("BAU!");
	}

	@Override
	public void run() {
		System.out.println("Sono un cane e corro!");
	}
}
