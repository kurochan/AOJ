import java.util.Scanner;

public class P0031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char val[];
		while (sc.hasNext()) {
			n = sc.nextInt();
			val = Integer.toBinaryString(n).toCharArray();
			for (int i = val.length - 1; i >= 0; i--) {
				if (Character.getNumericValue(val[i]) == 1) {
					System.out.print((int) Math.pow(2, val.length - i - 1));
					if (i > 0) {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}

	}

}
