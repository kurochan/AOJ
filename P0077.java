import java.util.Scanner;

public class P0077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char line[] = sc.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length; i++) {
				if (line[i] == '@') {
					int n = Character.getNumericValue(line[i + 1]);
					for (int j = 0; j < n; j++) {
						sb.append(line[i + 2]);
					}
					i += 2;
				} else {
					sb.append(line[i]);
				}
			}
			System.out.println(sb);
		}

	}

}
