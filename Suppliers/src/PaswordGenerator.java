import java.util.function.Predicate;
import java.util.function.Supplier;

public class PaswordGenerator {

	public int LENGTH = 8;

	public String getPassword() {
		StringBuilder sb = new StringBuilder();
		Predicate<Integer> p = i -> i % 2 != 0;
		Supplier<Integer> number = () -> (int) (Math.random() * 10);
		String values = "ABCDEFGHIJKLMNOPKRSTUVWXYZ%#@!1234567890";
		
		Supplier<Character> cha = () -> values.charAt((int) (Math.random() * (values.length() - 1)));
		Supplier<String> s = () -> {
			int count = 0;
			while (count < LENGTH) {
				if (p.test(count)) {
					sb.append(String.valueOf(cha.get()));
				} else {
					sb.append(String.valueOf(number.get()));
				}
				count++;
			}
			return sb.toString();
		};
		return s.get();
	}

}
