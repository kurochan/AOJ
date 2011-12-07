import java.util.Scanner;

public class P0028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int n[] = new int[101];
		while (sc.hasNext()) {
			n[sc.nextInt()]++;
		}
		for (int i : n) {
			if (i > max) {
				max = i;
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] == max) {
				System.out.println(i);
			}
		}
	}
}
