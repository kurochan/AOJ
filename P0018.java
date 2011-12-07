import java.util.Arrays;
import java.util.Scanner;

public class P0018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt() };
		Arrays.sort(n);
		for (int i = 4; i >= 0; i--) {
			System.out.print(n[i]);
			if (i > 0) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");

	}

}
