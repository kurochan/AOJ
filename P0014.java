import java.util.Scanner;

public class P0014 {

	public static void main(String[] args) {
		int d;
		int menseki;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			menseki = 0;
			d = s.nextInt();
			for (int i = 0; i < 600; i += d) {
				menseki += d * i * i;
			}
			System.out.println(menseki);
		}

	}

}
