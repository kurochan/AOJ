import java.util.Scanner;

public class P0206 {
	static Scanner s = new Scanner(System.in);

	public static boolean solve() {
		int l, m, n, mn = 0, ans = 0;
		l = s.nextInt();
		if (l <= 0) {
			return false;
		}
		for (int i = 0; i < 12; i++) {
			m = s.nextInt();
			n = s.nextInt();
			mn += m - n;
			if (mn >= l && ans <= 0) {
				ans = i + 1;
			}
		}
		if (ans > 0) {
			System.out.println(ans);
		} else {
			System.out.println("NA");
		}
		return true;
	}

	public static void main(String[] args) {
		while (solve())
			;
	}
}
