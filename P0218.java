import java.util.Scanner;

public class P0218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				int pm = sc.nextInt();
				int pe = sc.nextInt();
				int pj = sc.nextInt();
				if (pm >= 100 || pe >= 100 || pj >= 100) {
					System.out.println("A");
				} else if (pm + pe >= 180) {
					System.out.println("A");
				} else if (pe + pm + pj >= 240) {
					System.out.println("A");
				} else if (pe + pm + pj >= 210) {
					System.out.println("B");
				} else if ((pe + pm + pj >= 150) && (pe >= 80 || pm >= 80)) {
					System.out.println("B");
				} else {
					System.out.println("C");
				}
			}
		}

	}
}
