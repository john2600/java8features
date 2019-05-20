import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateParam {
	public static void main(String[] args) {
		//Predicate<Integer> p = l -> l.intValue() % 5 == 0;
		
		IntPredicate p = l -> l % 5 == 0;

		int[] values = { 2, 3, 1, 3123, 341, 40, 50, 25, 5, 125, 160 };

		List<Integer> result = new ArrayList<>(values.length);

		for (Integer value : values) {
			result.add(Integer.valueOf(value));
		}

		//result.stream().filter(i -> p.test(i)).forEach(y -> System.out.println(new Integer(y)));
		
		result.stream().filter(i -> p.test(i)).forEach(y -> System.out.println(new Integer(y)));

//		for(Integer value:values) {
//			if(isValid(p,value)) {
//				System.out.println(value);
//			}
//		}

	}

	public static boolean isValid(Predicate<Integer> pre, int value) {
		return pre.test(value);
	}
}
