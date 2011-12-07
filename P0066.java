import java.util.Scanner;

public class P0066 {

	static int count(char a, char b, char c) {
		if (a == b && b == c) {
			if (a == 'o') {
				return 1;
			} else if (a == 'x') {
				return 100;
			}
		} else {
			return 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		char c[];
		while (s.hasNextLine()) {
			n = 0;
			c = s.nextLine().toCharArray();
			n += count(c[0], c[1], c[2]);
			n += count(c[3], c[4], c[5]);
			n += count(c[6], c[7], c[8]);
			n += count(c[0], c[3], c[6]);
			n += count(c[1], c[4], c[7]);
			n += count(c[2], c[5], c[8]);
			n += count(c[0], c[4], c[8]);
			n += count(c[2], c[4], c[6]);
			if (n != 0) {
				if (n < 100) {
					System.out.println("o");
				} else {
					System.out.println("x");
				}
			} else {
				System.out.println("d");
			}
		}
	}
}
