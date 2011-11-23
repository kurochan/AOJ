import java.util.Scanner;

public class P0064 {

	static boolean isNumber(char c) {
		String str = new String(new char[] { c });
		try {
			Integer.valueOf(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		int pass = 0;
		int num = 0;
		while (sc.hasNext()) {
			line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (isNumber(line.charAt(i))) {
					num *= 10;
					num += Character.getNumericValue(line.charAt(i));
				} else if (num > 0) {
					pass += num;
					num = 0;
				}
			}
			if (num > 0) {
				pass += num;
				num = 0;
			}

		}
		System.out.println(pass);
	}
}
