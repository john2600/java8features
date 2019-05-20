package com.semanticsquare.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyTreeMap {

	public void solve() {

//		java.util.TreeSet<Integer> values = new java.util.TreeSet<Integer>((l1, l2) -> {
//			if (l1 > l1)
//				return -1;
//			else if (l1 < l2)
//				return +1;
//			return 0;
//		});
		// Natural Order
		
		//TreeMap<Integer, String> values2 = new TreeMap<Integer, String>();
		
		TreeMap<Integer, String> values2 = new TreeMap<Integer, String>((l1, l2) -> 
			  (l1 > l2)?-1:(l1 < l2)?1:0);

		//values.put(200, "adad");
		values2.put(200, "pepe");
		values2.put(2, "andres");
		values2.put(41, "wilson");
		values2.put(4, "laura");

		for(Entry<Integer, String> mpa: values2.entrySet()) {
			System.out.println(mpa.getKey()+" "+mpa.getValue());
		}

	}

	public static void main(String[] args) {
		MyTreeMap map = new MyTreeMap();
		map.solve();
	}

}
