import java.util.Scanner;

public class P0107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, w, h;
		int n;
		int r;
		while (sc.hasNext()) {
			l = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();
			if (l == 0 && w == 0 && h == 0) {
				break;
			}
			n = sc.nextInt();
			while (n-- != 0) {
				r = sc.nextInt();
				r = r * r * 4;
				if ((w * w + l * l) < r || (w * w + h * h) < r
						|| (l * l + h * h) < r) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}

}
