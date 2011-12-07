import java.util.Scanner;

public class P0226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			char r[] = sc.next().toCharArray();
			char a[] = sc.next().toCharArray();
			if (r.length == 1) {
				break;
			}
			int blow = 0;
			int hit = 0;
			for (int i = 0; i < r.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (i != j && r[i] == a[j]) {
						blow++;
					} else if (r[i] == a[j]) {
						hit++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}

	}
}
