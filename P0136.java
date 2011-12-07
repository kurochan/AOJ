import java.util.Scanner;

public class P0136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, data[] = new int[6], index;
		float temp;
		n = sc.nextInt();
		while (n-- != 0) {
			temp = sc.nextFloat();
			index = temp >= 160 ? (int) ((temp - 160) / 5) : 0;
			if (index < data.length) {
				data[index]++;
			} else {
				data[5]++;
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(i+1 + ":");
			for (int j = 0; j < data[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
