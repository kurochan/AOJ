import java.util.Scanner;

public class P0219 {

	static Scanner s;

	static void solve(int n) {
		int ice[] = new int[10];
		for (int i = 0; i < 10; i++) {
			ice[i] = 0;
		}
		while (n-- != 0) {
			ice[s.nextInt()]++;
		}
		for (int i : ice) {
			if (i == 0) {
				System.out.println("-");
				continue;
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		while (s.hasNext()) {
			int n = s.nextInt();
			if (n == 0) {
				break;
			}
			solve(n);
		}
	}
}
