import java.time.LocalDateTime;
import java.time.Month;

public class Exercise2 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("date "+ldt);

		int dd = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yy = ldt.getYear();
		
		System.out.println(String.format("%d %d %d", dd,mm,yy));
		
		int minute = ldt.getMinute();
		int second = ldt.getSecond();
		int hour = ldt.getHour();
		int nano = ldt.getHour();
		
		System.out.println(String.format("%d:%d:%d:%d",hour,minute,second, nano));
		
		int may = 5;
		
		LocalDateTime l = LocalDateTime.of(2009,Month.MAY,dd,hour,minute,second,nano);
		System.out.println("before "+l);
		// print after 5 month passed
		
		System.out.println("after 5 months "+l.plusMonths(may).plusYears(19));
	}
}
