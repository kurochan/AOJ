import java.util.Scanner;

public class P0025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		int hit, blow;

		while (sc.hasNext()) {
			hit = 0;
			blow = 0;
			for (int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				b[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) {
					hit++;
				}
				for (int j = 0; j < 4; j++) {
					if (i != j && a[i] == b[j]) {
						blow++;
						break;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}

	}

}
