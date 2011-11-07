import java.util.Scanner;

public class P2000 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, m, temp, r, c, count, mov, d;
		int vec[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		boolean map[][];
		while (s.hasNext()) {
			r = 10;
			c = 10;
			count = 0;
			n = s.nextInt();
			if (n == 0) {
				break;
			}
			map = new boolean[21][21];
			for (int i = 0; i < n; i++) {
				temp = s.nextInt();
				map[s.nextInt()][temp] = true;
			}
			m = s.nextInt();
			if (map[r][c]) {
				count++;
				map[r][c] = false;
			}
			for (int i = 0; i < m; i++) {
				switch (s.next().charAt(0)) {
				case 'N':
					d = 0;
					break;
				case 'E':
					d = 1;
					break;
				case 'S':
					d = 2;
					break;
				case 'W':
					d = 3;
					break;
				default:
					d = 0;
				}
				mov = s.nextInt();
				while (mov-- != 0) {
					r += vec[d][0];
					c += vec[d][1];
					if (map[r][c]) {
						count++;
						map[r][c] = false;
					}
				}
			}
			if (n == count) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}
