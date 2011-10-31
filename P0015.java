import java.math.BigInteger;
import java.util.Scanner;

public class P0015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans;
		BigInteger bi;
		while (n-- != 0 && sc.hasNext()) {
			bi = new BigInteger(sc.next());
			ans = bi.add(new BigInteger(sc.next())).toString();
			if (ans.length() <= 80) {
				System.out.println(ans);
			} else {
				System.out.println("overflow");
			}
		}
	}
}
