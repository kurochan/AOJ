import java.util.Scanner;

public class P0101 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str;

		s.nextLine();
		while (n-- != 0) {
			str = s.nextLine();
			str = str.replaceAll("Hoshino", "Hoshina");
			System.out.println(str);
		}
	}
}

