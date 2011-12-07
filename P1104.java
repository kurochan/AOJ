import java.util.Scanner;

public class P1104 {

	static int vec[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int mapX = sc.nextInt();
			int mapY = sc.nextInt();
			if (mapX == 0 && mapY == 0) {
				break;
			}
			int v = 0;
			int x = 0, y = 0;
			String command = sc.next();
			while (!command.equals("STOP")) {
				if (command.equals("FORWARD")) {
					int n = sc.nextInt();
					x += vec[v][0] * n;
					y += vec[v][1] * n;
				} else if (command.equals("BACKWARD")) {
					int n = sc.nextInt();
					x -= vec[v][0] * n;
					y -= vec[v][1] * n;
				} else if (command.equals("RIGHT")) {
					v++;
				} else if (command.equals("LEFT")) {
					v--;
				}
				if (x >= mapX) {
					x = mapX - 1;
				} else if (x < 0) {
					x = 0;
				}
				if (y >= mapY) {
					y = mapY - 1;
				} else if (y < 0) {
					y = 0;
				}
				v = (v + 4) % 4;
				command = sc.next();
			}
			System.out.println((x + 1) + " " + (y + 1));
		}
	}
}
