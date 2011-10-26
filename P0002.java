import java.util.Scanner;

public class P0002 {

	public static void main(String[] args) {
		int a, b;
		int keta;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			a = s.nextInt();
			b = s.nextInt();
			keta = 1;
			a = a + b;
			while (a >= 10) {
				a /= 10;
				keta++;
			}
			System.out.println(keta);
		}
	}
}
