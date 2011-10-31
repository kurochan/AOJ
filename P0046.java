import java.util.Scanner;

public class P0046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float max = 0, min = Float.MAX_VALUE;
		float temp;
		while (sc.hasNext()) {
			temp = sc.nextFloat();
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println(max - min);

	}

}
