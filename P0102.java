import java.util.Scanner;

public class P0102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int data[][] = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					data[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < n + 1; i++) {
				int sum1 = 0;
				int sum2 = 0;
				for (int j = 0; j < n; j++) {
					sum1 += data[j][i];
					sum2 += data[i][j];
				}
				data[n][i] = sum1;
				data[i][n] = sum2;
			}
			for (int i = 0; i < n + 1; i++) {
				for (int j = 0; j < n + 1; j++) {
					System.out.printf("%5d", data[i][j]);
				}
				System.out.print("\n");
			}
		}

	}
}
