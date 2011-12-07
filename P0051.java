import java.util.Arrays;
import java.util.Scanner;

public class P0051 {

	public static void main(String[] args) {
		String str;
		char buf[];
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		str = s.nextLine();
		while (n-- != 0) {
			int num[] = new int[8];
			int n1 = 0, n2 = 0;
			str = s.nextLine();
			buf = str.toCharArray();
			for (int i = 0; i < 8; i++) {
				num[i] = Character.getNumericValue(buf[i]);
			}
			Arrays.sort(num);
			for (int i = 0; i < 8; i++) {
				n1 += num[i] * Math.pow(10, i);
				n2 += num[i] * Math.pow(10, 7 - i);
			}
			System.out.println(n1 - n2);
		}
	}
}
