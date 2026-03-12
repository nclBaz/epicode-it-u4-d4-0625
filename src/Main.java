import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {
//		Animal a = new Animal("Gianni", 40);
//		a.sayYourName();

		Cat c1 = new Cat("Tom", 10, false);
		Dog d1 = new Dog("Rex", 5, true);
		c1.setAge(11);
		c1.sayYourName();
		c1.sayYourName("Ciao a tutti");
//		d1.sayYourName();

		System.out.println(c1);
		System.out.println(d1);

		Student aldo = new Student("Aldo", "Baglio");

		Runner[] runners = {d1, aldo, new Dog("Ringhio", 2, false)};
		Jumper[] jumpers = {c1, aldo};

		Animal[] animals = {c1, d1};

//		for (Runner runner : runners) {
//			runner.run();
//		}

		for (Jumper jumper : jumpers) {
			jumper.jump(10);
			if (jumper instanceof Cat) {
				Cat c = (Cat) jumper; // Avendo verificato che è un Cat posso fare il casting a Cat ed usare i suoi metodi
				c.makeSound();
			} else {
				System.out.println(jumper + " non è un gatto!");
			}

		}

//		for (Animal animal : animals) {
//			animal.makeSound();
//		}
//
//		makeAnimalSound(c1);
//		makeAnimalSound(d1);

	}

	public static void makeAnimalSound(Animal animal) { // Questo è un metodo con un parametro polimorfico, cioè posso passare qualsiasi tipo di Animal
		// indifferente se siano Cat o Dog. Così facendo il metodo è molto versatile
		animal.makeSound();
	}

//	public static void makeAnimalSound(Dog dog) { // Questo metodo accetta solo esclusivamente Dog. Non posso passargli altri tipi di Animal
//		// quindi è un metodo meno versatile
//		dog.makeSound();
//	}
}
