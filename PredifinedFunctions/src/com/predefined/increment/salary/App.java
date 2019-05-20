package com.predefined.increment.salary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.predefined.functions.Employee;

public class App {
	public static void main(String[] args) {
		ArrayList<Employee> employeList = new ArrayList<>();
		employeList.add(new Employee("Pepe", 232));
		employeList.add(new Employee("Juan", 1000));
		employeList.add(new Employee("Andrea", 2000));
		employeList.add(new Employee("Cesar", 2300));

		Predicate<Double> increment = i -> i <= 2000;
		Function<Double, Double> sum = s -> s.doubleValue() + 210;

		Function<Employee, Employee> sum2 = s -> {
			s.setSalary(s.getSalary() + 200);
			return s;
		};

		Function<List<Employee>, List<Employee>> l = i -> i.stream().filter(x -> filterSalary(increment, x.getSalary()))
				.map(y -> new Employee(y.getName(), sum.apply(y.getSalary()))).collect(Collectors.toList());

		l.apply(employeList).forEach(x -> System.out.println(x.toString()));
		List<Employee> l2 = new ArrayList<>();
		for (Employee employee : employeList) {
			if (increment.test(employee.getSalary())) {
				l2.add(sum2.apply(employee));
			}
		}
		System.out.println(l2.toString());
	}

	public static boolean filterSalary(Predicate<Double> increment, double value) {
		return increment.test(value);
	}
}
