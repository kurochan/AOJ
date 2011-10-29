import java.util.Scanner;

public class P0511 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean students[] = new boolean[30];
		for (int i = 0; i < 28; i++) {
			students[s.nextInt() - 1] = true;
		}
		for (int i = 0; i < 30; i++) {
			if (!students[i]) {
				System.out.println(i+1);
			}
		}
	}

}
