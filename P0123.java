import java.util.Scanner;

public class P0123 {

	public static void main(String[] args) {
		String data[] = { "AAA", "AA", "A", "B", "C", "D", "E", "NA" };
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			float a, b;
			a = sc.nextFloat();
			b = sc.nextFloat();
			if (a < 35.5) {
				a = 0;
			} else if (a < 37.5) {
				a = 1;
			} else if (a < 40) {
				a = 2;
			} else if (a < 43) {
				a = 3;
			} else if (a < 50) {
				a = 4;
			} else if (a < 55) {
				a = 5;
			} else if (a < 70) {
				a = 6;
			} else {
				a = 7;
			}

			if (b < 71) {
				b = 0;
			} else if (b < 77) {
				b = 1;
			} else if (b < 83) {
				b = 2;
			} else if (b < 89) {
				b = 3;
			} else if (b < 105) {
				b = 4;
			} else if (b < 116) {
				b = 5;
			} else if (b < 148) {
				b = 6;
			} else {
				b = 7;
			}

			System.out.println(data[(int) Math.max(a, b)]);

		}
	}
}
