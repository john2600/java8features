import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {
	public static final int NAME_SIZE = 9;

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("fasdfasdfasdfasd");
		names.add("Juan Murillo");
		names.add("Robert");
		names.add("pepe");
		names.add("Williams");
		names.add("Willian Richiters");

		System.out.println(names);

		Predicate<String> l = s -> s.length() >= NAME_SIZE;
		Function<String, String> s = x -> x.toUpperCase();
		
		List<String> resultNames = names.stream().map(y->s.apply(y)).filter(x -> l.test(x)).collect(Collectors.toList());

		System.out.println(resultNames);
		
		
		Predicate<String> minus = a->a.length()<=NAME_SIZE;
		resultNames = names.stream().filter(x->minus.test(x)).collect(Collectors.toList());
		System.out.println(resultNames);
		
		Long count = names.stream().filter(x->minus.test(x)).count();
		System.out.println(count);
		
	}
}
