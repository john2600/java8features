package com.predefined.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		List<Employee> employeList = new ArrayList<>();
		employeList.add(new Employee("Pepe",232));
		employeList.add(new Employee("Juan",1000));
		employeList.add(new Employee("Andrea",2000));
		employeList.add(new Employee("Cesar",2300));
		Function<ArrayList<Employee>,Double> l = x->x.stream().mapToDouble(it->it.getSalary()).sum();
		Double total = l.apply((ArrayList<Employee>) employeList);
		System.out.println("Total= "+total);
		
	}
	
}
