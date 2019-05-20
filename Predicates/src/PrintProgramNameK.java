import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintProgramNameK {
	public static void main(String[] args) {
		String[] name = { "kike", "epe", "aro", "maria", "katerine", "klain" };
		List<String> elements = Arrays.asList(name);
		Predicate<String> predicate = i -> i.charAt(0) == 'k';
		//List<String> newArray = elements.stream().filter(e -> filterName(predicate, e)).collect(Collectors.toList());
		//System.out.println(newArray.toString());
		
		 elements.stream().filter(e -> filterName(predicate, e)).forEach(x->System.out.println(x));
	}

	public static boolean filterName(Predicate<String> startWithK, String name) {
		return startWithK.test(name);
	}
}
