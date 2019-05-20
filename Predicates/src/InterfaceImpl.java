import java.util.function.Predicate;

public class InterfaceImpl {

	public static void main(String[] args) {

		PredicateJoining m1 = (n) -> {
			final StringBuilder sb = new StringBuilder();

			for (int number = 1; number < n; number++) {

				Predicate<Integer> result1 = i -> i % 2 == 0;
				Predicate<Integer> result2 = i -> i % 3 == 0;
				Predicate<Integer> result3 = result1.and(result2);
				boolean flag = true;

				if (result1.test(number)) {
					sb.append("foo").append("\n");
					flag=false;
				}

				if (result2.test(number)) {
					sb.append("bar").append("\n");
					flag=false;
				}

				if (result3.test(number)) {
					sb.append("foobar").append("\n");
					flag=false;
				}
				
				if (flag) {
					sb.append(String.valueOf(number)).append("\n");
				}
			}

			System.out.println(sb.toString());
		};

		m1.m1(10);
	}

}
