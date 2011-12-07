import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P0029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word[] = sc.nextLine().split(" ");
		Set<String> set = new TreeSet<String>();
		for (String str : word) {
			set.add(str);
		}
		String list[] = (String[]) set.toArray(new String[set.size()]);
		int count[] = new int[word.length];
		int cmax = 0, max = 0, mpos = 0, cpos = 0;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < word.length; j++) {
				if (list[i].equals(word[j])) {
					count[i]++;
					if (count[i] > cmax) {
						cmax = count[i];
						cpos = i;
					}
				}
			}
			if (list[i].length() > max) {
				max = list[i].length();
				mpos = i;
			}
		}
		System.out.println(list[cpos] + " " + list[mpos]);

	}
}
