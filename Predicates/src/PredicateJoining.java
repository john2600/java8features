import java.util.function.Predicate;

public interface PredicateJoining {
	void m1(int number);

	public static void main(String[] args) {
		PredicateJoining m1 = (n) -> {
			final StringBuilder sb = new StringBuilder();

			for (int number = 1; number < n; number++) {
				Predicate<Integer> result1 = i -> i % 2 == 0;
				Predicate<Integer> result2 = i -> i % 3 == 0;
				Predicate<Integer> result3 = result1.and(result2);
				Predicate<Integer> result4 = result1.negate().and(result2.negate()).and(result3.negate());

				if (check(result1, number))
					add("foo", sb);

				if (check(result2, number))
					add("bar", sb);

				if (check(result3, number))
					add("foobar", sb);

				if (result4.test(number))
					add(String.valueOf(number), sb);

			}

			System.out.println(sb.toString());
		};

		m1.m1(10);
	}

	public static boolean check(Predicate<Integer> result, int number) {
		return result.test(number);
	}

	public static void add(String message, StringBuilder sb) {
		sb.append(message).append("\n");
	}
}
