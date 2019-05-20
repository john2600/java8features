package com.bifcuntion.calculate;

import java.util.function.BiFunction;

public class CalculateMonthlySalary {
	public static void main(String[] args) {
		Employee employee = new Employee(100,"pepe",4500);
		
		TimeSheet timeSheet = new TimeSheet(100,30);
		
		BiFunction<Employee, TimeSheet, Double> f = (x,y)->x.getDailyWage()* y.getDays();
		
		System.out.println(f.apply(employee, timeSheet));
	}
}
