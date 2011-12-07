import java.util.Calendar;
import java.util.Scanner;

public class P0027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		int m, d;
		while (sc.hasNext()) {
			m = sc.nextInt();
			d = sc.nextInt();
			if (m == 0) {
				break;
			}
			c.set(2004, m - 1, d);
			d = c.get(Calendar.DAY_OF_WEEK);
			switch (d) {
			case Calendar.SUNDAY:
				System.out.println("Sunday");
				break;
			case Calendar.MONDAY:
				System.out.println("Monday");
				break;
			case Calendar.TUESDAY:
				System.out.println("Tuesday");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("Wednesday");
				break;
			case Calendar.THURSDAY:
				System.out.println("Thursday");
				break;
			case Calendar.FRIDAY:
				System.out.println("Friday");
				break;
			case Calendar.SATURDAY:
				System.out.println("Saturday");
				break;
			}
		}
	}

}
