import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(2010, Month.APRIL, 1);
		LocalDate now = LocalDate.now();

		Period p = Period.between(birthDate, now);
		System.out.println(String.format("%d:%d:%d", p.getYears(), p.getMonths(), p.getDays()));

		LocalDate experiation = LocalDate.of(2019 + 2, Month.DECEMBER, 1);

		Period pr = Period.between(now, experiation);

		System.out
				.println(String.format("dias restantes :%d", pr.getYears() * 365 + pr.getMonths() * 30 + pr.getDays()));

		System.out.println("Type year n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Year i = Year.of(n);
		if (i.isLeap()) {
			System.out.println(String.format("it is year leap %d", n));
		} else {
			System.out.println(String.format("it is not year leap %d", n));
		}
		
		in.close();
	}
}