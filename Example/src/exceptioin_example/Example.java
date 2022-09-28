package exceptioin_example;

import java.util.Scanner;

class InputException extends Exception{
	InputException(String message) {
		super(message);
	}
}

public class Example {
	public static void main(String[] args) {
		System.out.print("4byte 정수를 입력: ");
		Scanner sc = new Scanner(System.in);
		try {
			if(!sc.hasNextInt()) {
				throw new InputException("4byte 정수가 아닌 입력 발생");
			}
			int n = sc.nextInt();
			System.out.println("입력받은 정수: " + n);
		} catch (InputException e) {
			System.out.println("오류 메시지: " + e.getMessage());
		}
	}
}
