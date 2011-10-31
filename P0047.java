import java.util.Scanner;

public class P0047 {

	static boolean cup[] = { true, false, false };

	static void swap(String a, String b) {
		int m, n;
		boolean temp;
		if (a.equals("A")) {
			m = 0;
		} else if (a.equals("B")) {
			m = 1;
		} else {
			m = 2;
		}
		if (b.equals("A")) {
			n = 0;
		} else if (b.equals("B")) {
			n = 1;
		} else {
			n = 2;
		}
		temp = cup[m];
		cup[m] = cup[n];
		cup[n] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[];
		while (sc.hasNext()) {
			str = sc.nextLine().split(",");
			swap(str[0], str[1]);
		}
		if (cup[0]) {
			System.out.println("A");
		} else if (cup[1]) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
