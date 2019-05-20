import java.util.Date;
import java.util.function.Supplier;

public class App {
	public static void main(String[] args) {
		Supplier<Date> l = ()->new Date();
		
		System.out.println(l.get().toGMTString());
		System.out.println(l.get().toGMTString());
		System.out.println(l.get().toGMTString());
		System.out.println(l.get().toGMTString());
		System.out.println(l.get().toGMTString());
		System.out.println(l.get().toGMTString());
	}
}
