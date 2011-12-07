import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		while (s.hasNext()) {
			a = s.nextInt();
			b = s.nextInt();
			if (a == 0 || b == 0) {
				System.out.println(0);
				continue;
			}
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			System.out.println(b);

		}
	}

}
