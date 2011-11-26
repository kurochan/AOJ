import java.util.Scanner;

public class P0057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int ans = 1;
			for (int i = 0; i < n; i++) {
				ans += i + 1;
			}
			System.out.println(ans);
		}

	}

}
