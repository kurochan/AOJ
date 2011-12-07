import java.util.Scanner;
import java.util.Stack;

public class P0087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();
		String buf[];
		double temp1, temp2;
		while (sc.hasNext()) {
			buf = sc.nextLine().split(" ");
			for (String s : buf) {
				try {
					stack.add(Double.parseDouble(s));
				} catch (NumberFormatException e) {
					temp1 = stack.pop();
					temp2 = stack.pop();
					switch (s.charAt(0)) {
					case '+':
						stack.push(temp2 + temp1);
						break;
					case '-':
						stack.push(temp2 - temp1);
						break;
					case '*':
						stack.push(temp2 * temp1);
						break;
					case '/':
						stack.push(temp2 / temp1);
						break;
					}
				}
			}
			System.out.println(stack.pop());
		}

	}

}
