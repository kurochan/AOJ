import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P0075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String data[];
		int n;
		double w, h;

		while (sc.hasNext()) {
			data = sc.nextLine().split(",");
			n = Integer.valueOf(data[0]);
			w = Double.valueOf(data[1]);
			h = Double.valueOf(data[2]);
			if (w / (h * h) >= 25) {
				list.add(n);
			}
		}
		for (int i : list) {
			System.out.println(i);
		}

	}

}
