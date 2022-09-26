package mypack;

public class Timer {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; ; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
