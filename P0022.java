import java.util.Scanner;

public class P0022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int max = Integer.MIN_VALUE;
			int num[] = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum += num[j];
					max = Math.max(sum, max);
				}
			}
			System.out.println(max);
		}

	}

}
