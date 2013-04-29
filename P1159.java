

import java.util.Scanner;

public class P1159 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (n == 0 && p == 0) {
				return;
			}
			int cup = p;
			int table[] = new int[n];
			int pos = 0;

			while (true) {
				if (cup > 0) {
					if ((table[pos] + 1) == p) {
						break;
					}
					table[pos]++;
					cup--;
				} else {
					cup = table[pos];
					table[pos] = 0;
				}
				pos = (pos + n + 1) % n;
			}
			System.out.println(pos);
		}
	}
}
