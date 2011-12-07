import java.util.Scanner;

public class P0063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		char temp1[], temp2[];
		int count = 0;
		while (sc.hasNext()) {
			str1 = sc.nextLine();
			temp1 = str1.toCharArray();
			temp2 = new char[temp1.length];
			for (int i = 0; i < temp2.length; i++) {
				temp2[i] = temp1[temp1.length - i - 1];
			}
			str2 = new String(temp2);
			if (str1.equals(str2)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
