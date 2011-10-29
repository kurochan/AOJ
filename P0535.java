import java.util.Scanner;

public class P0535 {

	static int solve(boolean map[][], int r, int c) {
		int count[] = { 1, 1, 1, 1 };
		if (r < 0 || r >= map.length || c < 0 || c >= map[0].length) {
			return 0;
		}
		if (!map[r][c]) {
			return 0;
		}
		map[r][c] = false;
		count[0] += solve(map, r + 1, c);
		count[1] += solve(map, r - 1, c);
		count[2] += solve(map, r, c + 1);
		count[3] += solve(map, r, c - 1);
		map[r][c] = true;
		return Math.max(Math.max(count[0], count[1]),
				Math.max(count[2], count[3]));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m, n, max;
		boolean map[][];
		while (s.hasNext()) {
			max = 0;
			m = s.nextInt();
			n = s.nextInt();
			if (m == 0 && n == 0) {
				break;
			}
			map = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = s.nextInt() == 1 ? true : false;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					max = Math.max(solve(map, i, j), max);
				}
			}
			System.out.println(max);
		}

	}

}
