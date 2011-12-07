import java.util.Scanner;

public class P0050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word[] = sc.nextLine().split(" ");
		int list[] = new int[word.length];

		for (int i = 0; i < word.length; i++) {
			if (word[i].contains("apple")) {
				list[i] = 1;
			} else if (word[i].contains("peach")) {
				list[i] = 2;
			}
		}
		for (int i = 0; i < word.length; i++) {
			if (list[i] == 1) {
				word[i] = word[i].replace("apple", "peach");
			} else if (list[i] == 2) {
				word[i] = word[i].replace("peach", "apple");
			}
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
			if (i < word.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");

	}

}
