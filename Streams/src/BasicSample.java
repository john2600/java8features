import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasicSample {
	public static void main(String[] args) {
		List<Integer> il = new ArrayList<>();
		il.add(50);
		il.add(51);
		il.add(52);
		il.add(53);
		il.add(54);

		System.out.println(il);

		List<Integer> l = il.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(l);

		Predicate<Integer> p = i -> i.intValue() % 2 == 0;

		Function<Integer, Double> d = x -> Math.sqrt(x.intValue() * x.intValue());

		List<Double> l2 = il.stream().map(y -> d.apply(y)).filter(x -> p.test(x.intValue()))
				.collect(Collectors.toList());

		System.out.println(l2);

	}
}
