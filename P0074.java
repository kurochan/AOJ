import java.util.Scanner;

public class P0074 {

	static void print(int t) {
		int h = t / (60 * 60);
		t %= 60 * 60;
		int m = t / (60);
		t %= 60;
		System.out.printf("%02d:%02d:%02d\n", h, m, t);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			if (h == -1 && m == -1 && s == -1) {
				break;
			}
			int t1 = 120 * 60 - (h * 60 * 60 + m * 60 + s);
			int t2 = t1 * 3;
			print(t1);
			print(t2);
		}

	}

}
