import java.util.Scanner;

public class P0120 {

	static int success;
	static int map[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	static int vec[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	static void solve(int r, int c, int v, int batt) {
		if (r < 0 || r >= 3 || c < 0 || c >= 3) {
			return;
		}
		if (batt <= 0) {
			if (map[r][c] == 1) {
				success++;
			}
			return;
		}
		if (map[r][c] == 2) {
			solve(r - vec[v][0], c - vec[v][1], 0, batt - 1);
		} else {
			solve(r + 1, c, 0, batt - 1);
			solve(r - 1, c, 1, batt - 1);
			solve(r, c + 1, 2, batt - 1);
			solve(r, c - 1, 3, batt - 1);
		}

	}

	static void setRoom(String str, int type) {
		map[(str.charAt(0) - 'A') / 3][(str.charAt(0) - 'A') % 3] = type;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int batt;
		int start_r, start_c;
		String str;
		while (true) {
			success = 0;
			batt = s.nextInt();
			if (batt <= 0) {
				break;
			}
			str = s.next();
			start_r = (str.charAt(0) - 'A') / 3;
			start_c = (str.charAt(0) - 'A') % 3;
			setRoom(s.next(), 1);
			setRoom(s.next(), 2);
			solve(start_r, start_c, 0, batt);
			System.out.println((double) success / (double) Math.pow(4, batt));
		}
	}

}
