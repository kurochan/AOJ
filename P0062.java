import java.util.Scanner;

public class P0062 {

	public static void main(String[] args) {
		int num[] = new int[10];
		String str;
		char buf[];
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			str = s.nextLine();
			buf = str.toCharArray();
			for (int i = 0; i < 10; i++) {
				num[i] = Character.getNumericValue(buf[i]);
			}
			System.out.println(solve(num));

		}

	}

	public static int solve(int num[]) {
		if (num.length <= 1) {
			return num[0];
		}
		int next[] = new int[num.length - 1];
		for (int i = 0; i < num.length - 1; i++) {
			next[i] = (num[i] + num[i + 1]) % 10;
		}
		return solve(next);
	}
}
