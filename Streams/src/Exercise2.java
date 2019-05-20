import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robert");
		names.add("Abdc");
		names.add("WillianRichiters");
		names.add("JuanMurillo");
		names.add("Pepe");
		names.add("Williams");

		Comparator<String> c = (x, y) -> {
			String a = String.valueOf(x);
			String b = String.valueOf(y);
			return -a.compareTo(b);
		};

		List<String> result = names.stream().sorted(c).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(130);
		numbers.add(230);
		numbers.add(340);
		numbers.add(350);

		System.out.println(numbers);

		List<Integer> result2 = numbers.stream().sorted((x, y) -> -x.compareTo(y)).collect(Collectors.toList());

		System.out.println(result2);

	}
}
