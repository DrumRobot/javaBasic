package one_to_n;

public class Fibonacci {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int prev = 0, cur = 1;
		System.out.println(cur);
		for(int i = 1; i <= N; i++) {
			int t = cur;
			cur += prev;
			prev = t;
			System.out.println(cur);
		}
	}
}
