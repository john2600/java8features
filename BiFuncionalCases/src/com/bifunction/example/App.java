package com.bifunction.example;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class App {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

		
		
		BiFunction<String,Integer,Student> f = (x,y)->new Student(x,y);
		
		al.add(f.apply("pepe", 30));
		al.add(f.apply("juan", 40));
		al.add(f.apply("andrea", 10));
		al.add(f.apply("cesar", 12));
		al.add(f.apply("andres", 22));
		
		al.stream().forEach(i->System.out.println(i.toString()));
	}
}
