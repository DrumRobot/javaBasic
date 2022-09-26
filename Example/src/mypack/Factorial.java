package mypack;

public class Factorial {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(factorial(i));
		}
		System.out.println(recursive(10));
	}
	
	public static int factorial(int n) {
		int factorial = 1;

		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int recursive(int n) {
	    if (n == 1) {
	        return 1;
	    }
	    return recursive(n - 1) * n;
	}
}
