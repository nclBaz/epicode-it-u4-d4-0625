package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Student implements Jumper, Runner {
	private String name;
	private String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}

	@Override
	public void jump(int amount) {
		System.out.println("Sono uno studente e salto gli esami");
	}

	@Override
	public void run() {
		System.out.println("Corro per scappare dagli esami");
	}
}
