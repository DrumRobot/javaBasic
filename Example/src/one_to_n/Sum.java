package one_to_n;

public class Sum {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int sum = 0;

		for(int i = 1; i <= N; i++) {
			sum = sum + i;
			System.out.printf("i: %d, sum: %d\n", i, sum);
		}
		System.out.println(sum);
	}
}
