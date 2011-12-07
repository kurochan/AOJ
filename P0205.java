import java.util.Scanner;

public class P0205 {

	static void print(int num[], int w) {
		for (int n : num) {
			if (n == w) {
				System.out.println("1");
			} else if (w > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}

	static void solve(int num[]) {
		boolean p = false;
		boolean s = false;
		boolean r = false;
		for (int n : num) {
			if (n == 1) {
				r = true;
			} else if (n == 2) {
				s = true;
			} else if (n == 3) {
				p = true;
			}
		}
		if (p && s && r) {
			print(num, -1);
		} else if (p && s) {
			print(num, 2);
		} else if (p && r) {
			print(num, 3);
		} else if (s && r) {
			print(num, 1);
		} else {
			print(num, -1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n[] = new int[5];
		while (true) {
			n[0] = s.nextInt();
			if (n[0] == 0) {
				break;
			}
			n[1] = s.nextInt();
			n[2] = s.nextInt();
			n[3] = s.nextInt();
			n[4] = s.nextInt();
			solve(n);
		}

	}

}
