import java.util.Scanner;

public class P2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Point map[][] = new Point[n][];
			for (int i = 0; i < map.length; i++) {
				map[i] = new Point[n];
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					map[i][j] = new Point();
					map[i][j].x = sc.nextInt();
					map[i][j].y = sc.nextInt();
				}
			}
			int count = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					if (map[i][j].used) {
						continue;
					}
					int x = j;
					int y = i;
					while (!map[y][x]._used && !map[y][x].used) {
						map[y][x]._used = true;
						Point tmp =map[y][x];
						x = tmp.x;
						y = tmp.y;
					}
					if (!map[y][x].used) {
						count++;
					}
					for (int k = 0; k < map.length; k++) {
						for (int l = 0; l < map[0].length; l++) {
							if (map[k][l]._used) {
								map[k][l].used = true;
							}
							map[k][l]._used = false;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}

class Point {
	int x;
	int y;
	boolean _used;
	boolean used; 
}
