package com.semanticsquare.collections;

public class TreeSet {
	public void solve() {

		//natural order
		java.util.TreeSet<Integer> values = new java.util.TreeSet<Integer>((l1, l2) -> {
			if (l1 > l1)
				return -1;
			else if (l1 < l2)
				return +1;
			return 0;
		});

		values.add(200);
		values.add(20);
		values.add(40);
		values.add(10);
		values.add(4);

		values.stream().forEach((x) -> System.out.println(x.intValue()));

	}

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.solve();
	}

}
