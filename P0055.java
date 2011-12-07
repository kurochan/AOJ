import java.util.Scanner;

public class P0055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a[] = new double[10];
		double sum = 0;

		while (sc.hasNext()) {
			sum = 0;
			a[0] = sc.nextDouble();
			for (int i = 1; i < 10; i++) {
				if ((i + 1) % 2 == 0) {
					a[i] = a[i - 1] * 2;
				} else {
					a[i] = a[i - 1] / 3;
				}
			}
			for (double n : a) {
				sum += n;
			}
			System.out.println(sum);
		}

	}

}
