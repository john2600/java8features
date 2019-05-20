import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Exercise4 {
	public static void main(String[] args) {
		ZoneId id = ZoneId.systemDefault();

		System.out.println(id);

		Set<String> id2 = ZoneId.getAvailableZoneIds();

		// id2.stream().forEach(x->System.out.println(x));

		ZoneId l = ZoneId.of("Australia/Lindeman");

		ZonedDateTime zdt = ZonedDateTime.now(l);

		System.out.println(zdt);
		
		LocalDate dt = LocalDate.of(2019, Month.APRIL, 30);
		System.out.println(dt);
		
		String d = LocalDate.parse("2019-05-20").format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(d);
		
		
		String d2 = LocalDate.parse("2019-05-18").format(DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(d2);
		
		//LocalDate d3 = LocalDate.parse("2019-05-20T:12:45:30.4516",DateTimeFormatter.ISO_DATE_TIME);
		
		//System.out.println(d3.getDayOfMonth());
		
		LocalDateTime newDate = LocalDateTime.of(2014,7,31,1,1);
		newDate.plusMonths(1);
		newDate.plusDays(30);
		
		System.out.println(LocalDateTime.of(2014,7,31,1,1).plusMonths(1).plusDays(30));
		
		System.out.println(newDate);

	}
}
