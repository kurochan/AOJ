import java.util.Scanner;

public class P1224 {

	public static void main(String[] args) {
		int fuel1[] = new int[54];
		int fuel2[] = new int[96];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fuel1.length; i++) {
			fuel1[i] = i * i * i;
		}
		for (int i = 0; i < fuel2.length; i++) {
			fuel2[i] = i * (i + 1) * (i + 2) / 6;
		}
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int max = 0;
			if (n == 0) {
				break;
			}
			for (int i = 0; i < fuel1.length; i++) {
				for (int j = 0; j < fuel2.length; j++) {
					int sum = fuel1[i] + fuel2[j];
					if (sum <= n) {
						max = Math.max(max, sum);
					}
				}
			}
			System.out.println(max);
		}

	}
}
