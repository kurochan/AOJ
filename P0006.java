import java.util.Scanner;

public class P0006 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char str[] = new char[0];
		str = s.nextLine().toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
		System.out.print("\n");
	}
}
