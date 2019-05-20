import java.util.function.Supplier;

public class RandomOTP {
	public static void main(String[] args) {
		Supplier<String> c = () -> {
			StringBuilder sb = new StringBuilder();
			int count = 0;
			while (count < 6) {
				sb.append(String.valueOf((int) (Math.random() * 10)));
				count++;
			}
			return sb.toString();
		};

		System.out.println(c.get());
		System.out.println(c.get());
		System.out.println(c.get());
		System.out.println(c.get());
		System.out.println(c.get());
		System.out.println(c.get());
		System.out.println(c.get());
	}

}

