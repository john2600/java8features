package com.semanticsquare.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorWithLambda {

	List<Simpson> simpsons = new ArrayList<>();

	public void solve() {

		simpsons.add(new Simpson("Bart"));
		simpsons.add(new Simpson("Homero"));
		simpsons.add(new Simpson("Lisa"));
		simpsons.add(new Simpson("Maggie"));
		simpsons.add(new Simpson("March"));
		simpsons.add(new Simpson("Apu"));
		simpsons.add(new Simpson("Moe"));

		Collections.sort(simpsons, (a, b) -> {
			if (a.getName().charAt(0) < (b.getName().charAt(0))) {
				return -1;
			} else if (a.getName().charAt(0) > (b.getName().charAt(0))) {
				return +1;
			}
			return 0;
		});

		simpsons.stream().forEach(x -> System.out.println(x.getName()));

	}

	public static void main(String[] args) {
		ComparatorWithLambda lambda = new ComparatorWithLambda();

		lambda.solve();
	}

}
