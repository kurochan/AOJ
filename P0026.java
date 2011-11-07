import java.util.Scanner;

public class P0026 {

	static int map[][] = new int[10][10];

	static void big(int r, int c) {
		paint(r + 2, c);
		
		paint(r + 1, c - 1);
		paint(r + 1, c);
		paint(r + 1, c + 1);
		
		paint(r, c - 2);
		paint(r, c - 1);
		paint(r, c);
		paint(r, c + 1);
		paint(r, c + 2);
		
		paint(r - 1, c - 1);
		paint(r - 1, c);
		paint(r - 1, c + 1);
		
		paint(r - 2, c);
	}

	static void normal(int r, int c) {
		paint(r + 1, c - 1);
		paint(r + 1, c);
		paint(r + 1, c + 1);
		paint(r, c - 1);
		paint(r, c);
		paint(r, c + 1);
		paint(r - 1, c - 1);
		paint(r - 1, c);
		paint(r - 1, c + 1);
	}

	static void small(int r, int c) {
		paint(r + 1, c);
		paint(r, c - 1);
		paint(r, c);
		paint(r, c + 1);
		paint(r - 1, c);
	}

	static void paint(int r, int c) {
		if (r < 0 || r >= 10 || c < 0 || c >= 10) {
			return;
		}
		map[r][c]++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, max = 0;
		String temp[];
		while (sc.hasNext()) {
			temp = sc.nextLine().split(",");
			switch (Integer.valueOf(temp[2])) {
			case 1:
				small(Integer.valueOf(temp[1]), Integer.valueOf(temp[0]));
				break;
			case 2:
				normal(Integer.valueOf(temp[1]), Integer.valueOf(temp[0]));
				break;
			case 3:
				big(Integer.valueOf(temp[1]), Integer.valueOf(temp[0]));
				break;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 0) {
					count++;
				}
				if (map[i][j] > max) {
					max = map[i][j];
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}
