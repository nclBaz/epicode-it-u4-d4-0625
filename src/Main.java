import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal("Gianni", 40);
//		a.sayYourName();

		Cat c1 = new Cat("Tom", 10, false);
		Dog d1 = new Dog("Rex", 5, true);
		c1.setAge(11);
		c1.sayYourName();
		c1.sayYourName("Ciao a tutti");
//		d1.sayYourName();

		System.out.println(c1);
		System.out.println(d1);


	}
}
