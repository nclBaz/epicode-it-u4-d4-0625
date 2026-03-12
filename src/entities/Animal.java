package entities;

public abstract class Animal { // Questa sarà la SUPERCLASSE
	// Qua inseriremo tutte le caratteristiche (metodi e attributi) comuni a tutti gli animali
	// I figli erediteranno queste caratteristiche, poi potranno aggiungerne di altre più specifiche per il tipo di animale in questione
	private final String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// GETTER & SETTER
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	// METODI
	public void sayYourName() {
		System.out.println("Ciao sono un Animal e mi chiamo " + this.name + ", la mia età è: " + this.age);
	}

	public abstract void makeSound(); // essendo abstract il metodo è "VUOTO"
	// Obblighiamo i figli ad avere questo metodo senza dire loro
	// cosa dovrà fare questo metodo

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
