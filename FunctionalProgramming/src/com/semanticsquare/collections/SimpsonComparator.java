package com.semanticsquare.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonComparator {
	public static void main(String[] args) {
		List<Simpson> simpsons = new ArrayList<>();
		simpsons.add(new Simpson("Bart"));
		simpsons.add(new Simpson("Homero"));
		simpsons.add(new Simpson("Lisa"));
		simpsons.add(new Simpson("Maggie"));
		simpsons.add(new Simpson("March"));
		simpsons.add(new Simpson("Apu"));
		simpsons.add(new Simpson("Moe"));
		
		Collections.sort(simpsons, Collections.reverseOrder());
		System.out.println(simpsons);
		Collections.reverse(simpsons);
		System.out.println(simpsons);
		
	}
}
