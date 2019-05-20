import java.util.Random;
import java.util.function.Supplier;

public class RandomName {
	private String[] names = { "pepe", "juan", "maria", "elvira", "andrea" };

	public String getNameRandom() {
		Random ran = new Random();
		Integer value = ran.nextInt(4)+1;
		Supplier<String> s = () -> names[value];
		return s.get();
	}
	
	public static void main(String[] args) {
		RandomName r = new RandomName();
		System.out.println(r.getNameRandom());;
	}
}
