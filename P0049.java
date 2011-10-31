import java.util.Scanner;

public class P0049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, ab = 0, o = 0;
		String str;
		while (sc.hasNext()) {
			str = sc.nextLine().split(",")[1];
			if (str.equals("A")) {
				a++;
			} else if (str.equals("B")) {
				b++;
			} else if (str.equals("O")) {
				o++;
			} else {
				ab++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);

	}
}
