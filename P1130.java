import java.util.Scanner;

public class P1130 {

	static int solve(char map[][], int r, int c) {
		int count = 0;
		if (r < 0 || r >= map.length || c < 0 || c >= map[0].length) {
			return 0;
		}
		if (map[r][c] != '.') {
			return 0;
		}

		map[r][c] = '!';
		count += 1;
		count += solve(map, r + 1, c);
		count += solve(map, r - 1, c);
		count += solve(map, r, c + 1);
		count += solve(map, r, c - 1);

		return count;

	}

	public static void main(String[] args) {
		char map[][];
		Scanner s = new Scanner(System.in);
		int w, h, count;

		while (true) {
			count = 0;
			w = s.nextInt();
			h = s.nextInt();
			map = new char[h][];
			s.nextLine();
			if (w == 0 && h == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				map[i] = s.nextLine().toCharArray();
			}
			loop: for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '@') {
						map[i][j] = '.';
						count = solve(map, i, j);
						break loop;
					}
				}
			}
			System.out.println(count);
		}

	}
}
