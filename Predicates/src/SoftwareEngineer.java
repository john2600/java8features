import java.util.Arrays;
import java.util.function.Predicate;

public class SoftwareEngineer {
	String name;
	int age;
	boolean isGf;

	public SoftwareEngineer(String name, int age, boolean isGf) {
		this.name = name;
		this.age = age;
		this.isGf = isGf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGf() {
		return isGf;
	}

	public void setGf(boolean isGf) {
		this.isGf = isGf;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isGf=" + isGf + "]";
	}

	public static void main(String[] args) {
		SoftwareEngineer[] softwareEngineers = { new SoftwareEngineer("pepe", 30, true),
				new SoftwareEngineer("Andrea", 13, false), new SoftwareEngineer("Cesar", 16, false),
				new SoftwareEngineer("John", 12, true), new SoftwareEngineer("Pablo", 29, true),

		};

		Predicate<SoftwareEngineer> allowed = softEngineer -> softEngineer.getAge() > 18 && softEngineer.isGf == true;

		Arrays.asList(softwareEngineers).stream().filter(age -> filterAllowed(allowed, age))
				.forEach(x -> System.out.println(x.toString()));
	}

	public static boolean filterAllowed(Predicate<SoftwareEngineer> predicate, SoftwareEngineer softEngineer) {
		return predicate.test(softEngineer);
	}

}
