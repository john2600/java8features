import java.util.function.Function;
import java.util.function.Predicate;

public class RemoveSpaces {
	public static void main(String[] args) {
		String value = "a information, covering in this course";

		Predicate<String> remove = s -> s.contains(" ");
		char[] values = value.toCharArray();
		StringBuilder sb = new StringBuilder();
		value.chars().mapToObj(i -> (char) i).filter(l -> removeSpace2(remove, String.valueOf(l)))
				.forEach(y -> sb.append(y));
		
		
		
		//System.out.println(myFunction);
		
		System.out.println(sb.toString());
		Function<String,String> l = x->x.replaceAll(" ", "");
		System.out.println(l.apply(value));
		
		Function<String,Integer> sizeString = x->x.length() - x.replaceAll(" ", "").length();
		System.out.println("Size of Stream is "+sizeString.apply(value));

	}

	public static String removeSpace(char[] values, String value) {
		return null;
	}

	public static boolean removeSpace2(Predicate<String> valid, String value) {
		return valid.negate().test(value);
	}

}
