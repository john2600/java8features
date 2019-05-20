import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RemoveNullandEmpty {
	
	public static void main(String[] args) {
		String[] name = { "kike", "", "", "maria", "katerine", "   ",null };
		List<String> elements = Arrays.asList(name);
		Predicate<String> condition1 = x-> x!=null;
		Predicate<String> condition2 = y->!y.trim().isEmpty();
	
		
		List<String> result = new ArrayList<>();
		elements.stream().filter(e -> filterName(condition1.and(condition2), e)).forEach(y->result.add(y));
		
		System.out.println(result);
	}

	public static boolean filterName(Predicate<String> name, String value) {
		return name.test(value);
	}

}
