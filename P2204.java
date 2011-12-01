import java.util.Scanner;

public class P2204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int max = 0;
			int min = Integer.MAX_VALUE;
			while (n-- != 0) {
				int sum = 0;
				for (int j = 0; j < 5; j++) {
					sum += sc.nextInt();
				}
				max = Math.max(sum, max);
				min = Math.min(sum, min);
			}
			System.out.println(max + " " + min);
		}

	}

}
