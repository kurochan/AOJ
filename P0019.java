import java.util.Scanner;

public class P0019 {

	static long fact(long n) {
		return n > 0 ? n * fact(n - 1) : 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(fact(n));
	}

}
