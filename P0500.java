import java.util.Scanner;

public class P0500 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sca, scb, a, b;
		while (sc.hasNext()) {
			sca = 0;
			scb = 0;
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				if (a > b) {
					sca += a + b;
				} else if (a < b) {
					scb += a + b;
				} else {
					sca += a;
					scb += b;
				}
			}
			System.out.println(sca + " " + scb);
		}

	}
}
