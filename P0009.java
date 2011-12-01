import java.util.Scanner;

public class P0009 {

	static boolean is_prime(int n) {
		boolean flag;
		int i;
		if (n < 2) {
			flag = false;
		} else if (n == 2) {
			flag = true;
		} else if (n % 2 == 0) {
			flag = false;
		} else
			loop: {
				for (i = 3; i * i <= n; i += 2) {
					if (n % i == 0) {
						flag = false;
						break loop;
					}
				}
				flag = true;
			}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for (int i = 2; i <= n; i++) {
				if (is_prime(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
