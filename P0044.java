import java.util.Scanner;

public class P0044 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean num[];
		int n;

		while (s.hasNext()) {
			n = s.nextInt();
			num = new boolean[n * 2];
			for (int i = 2; i < num.length; i++) {
				if (num[i]) {
					continue;
				}
				for (int j = i * 2; j < num.length; j += i) {
					num[j] = true;
				}
			}
			for (int i = n - 1; i >= 0; i--) {
				if (!num[i]) {
					System.out.print(i+" ");
					break;
				}
			}
			for (int i = n + 1; i < num.length; i++) {
				if (!num[i]) {
					System.out.print(i);
					break;
				}

			}
			System.out.print("\n");
		}
	}

}
