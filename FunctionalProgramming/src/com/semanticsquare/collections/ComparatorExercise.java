package com.semanticsquare.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExercise {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(0);
		l.add(10);
		l.add(20);
		
		Collections.sort(l);
		//Collections.sort(l, new Comparator());
		
		l.stream().forEach(x-> System.out.println(x.intValue()));
		
	}
}


