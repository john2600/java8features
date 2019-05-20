import java.util.Scanner;
import java.util.function.Predicate;

public class AgeValidation {
	public static void main(String[] args) {
		boolean open = true;
		Scanner in = new Scanner(System.in);
		Predicate<Integer> validaAge = a -> a > 17;

		String name = null;
		int age;
		String option = "";
		while (open) {
			System.out.println("type your name");
			name = in.nextLine();
			System.out.println("type your age");
			age = in.nextInt();
			if (validateAge(validaAge, age)) {
				System.out.println("Welcome to the party");
			} else {
				System.out.println("you dont have the age allowed to enter");
			}
			System.out.println("New person");
			open = in.nextBoolean();
			
		}

	}

	public static boolean validateAge(Predicate<Integer> pre, int age) {
		return pre.test(age);
	}
}
