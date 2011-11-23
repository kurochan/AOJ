import java.util.Scanner;

public class P0158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count;
		while (sc.hasNext()) {
			n = sc.nextInt();
			count = 0;
			if (n == 0) {
				break;
			}
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n *= 3;
					n++;
				}
				count++;
			}
			System.out.println(count);
		}

	}

}
