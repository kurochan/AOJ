import java.util.Scanner;

public class P0059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			float x[] = new float[4];
			float y[] = new float[4];
			x[0] = sc.nextFloat();
			y[0] = sc.nextFloat();
			x[1] = sc.nextFloat();
			y[1] = sc.nextFloat();
			x[2] = sc.nextFloat();
			y[2] = sc.nextFloat();
			x[3] = sc.nextFloat();
			y[3] = sc.nextFloat();
			if (x[0] <= x[3] && x[2] <= x[1] && y[0] <= y[3] && y[2] <= y[1]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
