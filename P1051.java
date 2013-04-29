import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Set<Integer> data = new HashSet<Integer>();
			while (n-- != 0) {
				data.add(sc.nextInt());
			}
			Integer pages[] = (Integer[]) data.toArray(new Integer[0]);
			Arrays.sort(pages);
			boolean start = true;
			for (int i = 0; i < pages.length; i++) {
				if (start) {
					start = false;
					if (i != 0) {
						System.out.print(" ");
					}
					System.out.print(pages[i]);
					if (i < pages.length - 1 && pages[i] != pages[i + 1] - 1) {
						start = true;
					}
					continue;
				}
				if (i == pages.length - 1 || pages[i] != pages[i + 1] - 1) {
					start = true;
					System.out.print("-");
					System.out.print(pages[i]);
					continue;
				}
			}
			System.out.println();
		}

	}
}
