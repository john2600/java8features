import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LambdaBasic {
	public void setElements() {
		Comparator<String> compa = (s1, s2) -> {
			return s1.length() - s2.length();
		};

		// Set<String> elements = new TreeSet<>(compa); //new HashSet<>();
		// Set<String> elements = new HashSet<>(); //new HashSet<>();
		// HashSet not keep the same order and TreeSet natural order

		// LinkedHashSet keep the order of insertion
		Set<String> elements = new LinkedHashSet<>();
		elements.add("John");
		elements.add("Pepe");
		elements.add("Maria");
		elements.add("Andres");
		elements.add("Andrea");
		elements.add("Andrea");
		elements.add("Jose");
		elements.add("Cesar");

		System.out.println(Arrays.toString(elements.toArray()));

	}

	public static void main(String[] args) {
		LambdaBasic lb = new LambdaBasic();
		lb.setElements();
	}
}
