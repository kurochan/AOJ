import java.util.Scanner;

public class P0030 {

	static int solve(int n, int s, int p) {
		if (n <= 0) {
			if (s == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		int count = 0;
		for (int i = p; i <= 9; i++) {
			count += solve(n - 1, s - i, i + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0 && s == 0) {
				break;
			}
			System.out.println(solve(n, s, 0));
		}

	}
}
