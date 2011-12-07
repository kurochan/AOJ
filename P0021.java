import java.util.Scanner;

public class P0021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			double x[] = new double[4];
			double y[] = new double[4];
			x[0] = sc.nextFloat();
			y[0] = sc.nextFloat();
			x[1] = sc.nextFloat();
			y[1] = sc.nextFloat();
			x[2] = sc.nextFloat();
			y[2] = sc.nextFloat();
			x[3] = sc.nextFloat();
			y[3] = sc.nextFloat();
			if ((x[0] - x[1]) * (y[2] - y[3]) == (x[2] - x[3]) * (y[0] - y[1])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
