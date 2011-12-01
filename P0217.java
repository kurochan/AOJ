import java.util.Scanner;

public class P0217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int mp = 0, md = 0;
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int d = sc.nextInt() + sc.nextInt();
				if (d > md) {
					mp = p;
					md = d;
				}
			}
			System.out.println(mp + " " + md);
		}

	}

}
