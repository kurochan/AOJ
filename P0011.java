import java.util.Scanner;

public class P0011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int swap[][] = new int[n][2];
		int map[] = new int[w];

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			swap[i][0] = Integer.valueOf(str.split(",")[0]);
			swap[i][1] = Integer.valueOf(str.split(",")[1]);
		}

		for (int i = 0; i < w; i++) {
			int num = i + 1;
			for (int j = 0; j < n; j++) {
				if (num == swap[j][0]) {
					num = swap[j][1];
				} else if (num == swap[j][1]) {
					num = swap[j][0];
				}
			}
			map[num - 1] = i + 1;
		}
		for (int i : map) {
			System.out.println(i);
		}

	}
}
