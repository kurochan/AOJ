import java.util.Scanner;

public class P0036 {

	static int A[][] = { { 1, 1 }, { 1, 1 } };
	static int B[][] = { { 1 }, { 1 }, { 1 }, { 1 } };
	static int C[][] = { { 1, 1, 1, 1 } };
	static int D[][] = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
	static int E[][] = { { 1, 1, 0 }, { 0, 1, 1 } };
	static int F[][] = { { 1, 0 }, { 1, 1 }, { 0, 1 } };
	static int G[][] = { { 0, 1, 1 }, { 1, 1, 0 } };
	static int map[][] = new int[8][8];

	static boolean isEqual(int r, int c, int data[][]) {
		if (r + data.length > map.length || c + data[0].length > map[0].length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if (map[r + i][c + j] != data[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loop1: while (sc.hasNext()) {
			for (int i = 0; i < 8; i++) {
				String line = sc.nextLine();
				if (line.equals("")) {
					continue loop1;
				}
				for (int j = 0; j < 8; j++) {
					if (line.charAt(j) == '0') {
						map[i][j] = 0;
					} else {
						map[i][j] = 1;
					}
				}
			}

			loop: for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (isEqual(i, j, A)) {
						System.out.println("A");
						break loop;
					} else if (isEqual(i, j, B)) {
						System.out.println("B");
						break loop;
					} else if (isEqual(i, j, C)) {
						System.out.println("C");
						break loop;
					} else if (isEqual(i, j, D)) {
						System.out.println("D");
						break loop;
					} else if (isEqual(i, j, E)) {
						System.out.println("E");
						break loop;
					} else if (isEqual(i, j, F)) {
						System.out.println("F");
						break loop;
					} else if (isEqual(i, j, G)) {
						System.out.println("G");
						break loop;
					}
				}
			}

		}

	}

}
