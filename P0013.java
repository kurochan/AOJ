import java.util.Scanner;
import java.util.Stack;

public class P0013 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n;
		while (s.hasNext()) {
			n = s.nextInt();
			if (n != 0) {
				stack.push(n);
			} else {
				System.out.println(stack.pop());
			}
		}
	}
}
