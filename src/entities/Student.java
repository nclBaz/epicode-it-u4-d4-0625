package entities;

import interfaces.Jumper;
import interfaces.Runner;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
	}

}
