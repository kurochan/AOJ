import java.util.Scanner;

public class P0084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word[] = sc.nextLine().split(" ");
		String temp1[], temp2[], ans = "";

		for (String s1 : word) {
			temp1 = s1.split("\\.");
			for (String s2 : temp1) {
				temp2 = s2.split(",");
				for (String s3 : temp2) {
					if (s3.length() >= 3 && s3.length() <= 6) {
						ans += s3 + " ";
					}
				}
			}
		}
		while (ans.charAt(ans.length() - 1) == ' ') {
			ans = ans.substring(0, ans.length() - 1);
		}
		System.out.print(ans + "\n");

	}

}
