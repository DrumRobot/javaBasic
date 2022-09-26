package one_to_n;

public class Factorial {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int factorial = 1;

		for(int i = 1; i <= N; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
