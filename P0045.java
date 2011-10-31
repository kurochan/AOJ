import java.util.Scanner;

public class P0045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, bsum = 0, n = 0;
		String num[];
		while (sc.hasNext()) {
			num = sc.nextLine().split(",");
			bsum += Integer.valueOf(num[1]);
			n++;
			sum += Integer.valueOf(num[0]) * Integer.valueOf(num[1]);
		}
		System.out.println(sum);
		System.out.println((int) ((float) bsum / n + 0.5));
	}

}
