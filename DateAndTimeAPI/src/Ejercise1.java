import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercise1 {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		LocalDate ld = LocalDate.now();

		System.out.println(lt);
		System.out.println(ld);

		int day = ld.getDayOfMonth();
		int month = ld.getMonthValue();
		int year = ld.getYear();

		System.out.println("day " + day + " " + " month " + month + " year " + year);

		System.out.println(String.format("%d:%d:%d", day, month, year));

		int a = lt.getNano();
		System.out.println(a);

		int b = lt.getNano();

		System.out.println(b);

		int second = lt.getSecond();
		int minute = lt.getMinute();
		int hour = lt.getHour();
		int nano = lt.getNano();

		System.out.println(String.format("Hora %d minuto %d segundo %d nanosegundo %d", hour, minute, second, nano));
		
		
	}
}
