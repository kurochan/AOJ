import java.util.Scanner;

public class P0048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data[] = { "heavy", "light heavy", "middle", "light middle",
				"welter", "light welter", "light", "feather", "bantam", "fly",
				"light fly" };
		float w;
		while (sc.hasNext()) {
			w = sc.nextFloat();
			if (w > 91) {
				w = 0;
			} else if (w > 81) {
				w = 1;
			} else if (w > 75) {
				w = 2;
			} else if (w > 69) {
				w = 3;
			} else if (w > 64) {
				w = 4;
			} else if (w > 60) {
				w = 5;
			} else if (w > 57) {
				w = 6;
			} else if (w > 54) {
				w = 7;
			} else if (w > 51) {
				w = 8;
			} else if (w > 48) {
				w = 9;
			} else {
				w = 10;
			}
			System.out.println(data[(int) w]);
		}
	}

}
