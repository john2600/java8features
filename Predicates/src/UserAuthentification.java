import java.util.function.Predicate;

public class UserAuthentification {
	public static void main(String[] args) {
		Predicate<User> notEmpty = x -> x != null && x.getName() != null && x.getPassword() != null;
		Predicate<User> credentials = p -> p != null && p.getPassword().equals("1234") && p.getName().equals("user1");

		String user = "user1";
		String password = "1234";
		User newUser = new User(user, password);

		newUser=null;
		
		if (validateUser(notEmpty.and(credentials), newUser)) {
			System.out.println("user is logged");
		} else {
			System.out.println("credentials not valid");
		}

	}

	public static boolean validateUser(Predicate<User> userCredentials, User value) {
		return userCredentials.test(value);
	}
}
