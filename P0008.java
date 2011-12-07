import java.util.Scanner;

public class P0008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (i > n) {
					break;
				}
				for (int j = 0; j < 10; j++) {
					if (i + j > n) {
						break;
					}
					for (int k = 0; k < 10; k++) {
						int sum = i + j + k;
						if (sum <= n && sum >= n - 9) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}

	}
}
