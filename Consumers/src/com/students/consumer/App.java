package com.students.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		Student student = new Student("john", 30);
		// System.out.println(student);

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("john", 30));
		students.add(new Student("pepe", 10));
		students.add(new Student("andrea", 90));
		students.add(new Student("carla", 50));

		Consumer<String> c = s -> System.out.println(s.toString());

		Predicate<Student> checkRank = i -> i.getMark() >= 50;
		Function<Student, String> result = x -> {
			if (x.getMark() >= 80) {
				return "excelent";
			} else if (x.getMark() >= 60) {
				return "Gorod";
			} else if ((x.getMark() >= 40)) {
				return "regular";
			} else {
				return "Bad";
			}

		};

		for (Student s : students) {
			if (checkRank.test(s)) {
				System.out.println(s.toString() + " " + result.apply(s));
			}
		}

		System.out.println();
		students.stream().filter(i -> checkRank.test(i)).forEach(x -> 
		c.accept(x.toString() + result.apply(x)));

	}
}
