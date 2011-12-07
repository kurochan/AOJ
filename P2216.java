import java.util.Scanner;

public class P2216 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cd, pay, back, m1000, m500, m100;

		while (true) {
			cd = s.nextInt();
			pay = s.nextInt();
			if (cd == 0 && pay == 0) {
				break;
			}
			back = pay - cd;
			m1000 = back / 1000;
			back -= m1000 * 1000;
			m500 = back / 500;
			back -= m500 * 500;
			m100 = back / 100;

			System.out.println(m100 + " " + m500 + " " + m1000);

		}

	}

}
