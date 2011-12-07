import java.util.Scanner;

public class P0058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xa, ya, xb, yb, xc, yc, xd, yd;
		double a, b;
		while (sc.hasNext()) {

			xa = sc.nextDouble();
			ya = sc.nextDouble();
			xb = sc.nextDouble();
			yb = sc.nextDouble();
			xc = sc.nextDouble();
			yc = sc.nextDouble();
			xd = sc.nextDouble();
			yd = sc.nextDouble();

			a = (yb - ya) / (xb - xa);
			b = -(xd - xc) / (yd - yc);
			if (a == b || (Double.isInfinite(a) && Double.isInfinite(b))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}

}
