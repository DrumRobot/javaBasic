package exceptioin_example;

import java.util.Scanner;

class InputException extends Exception{
	InputException(String message) {
		super(message);
	}
}

public class Example {
	public static void main(String[] args) {
		System.out.print("4byte ������ �Է�: ");
		Scanner sc = new Scanner(System.in);
		try {
			if(!sc.hasNextInt()) {
				throw new InputException("4byte ������ �ƴ� �Է� �߻�");
			}
			int n = sc.nextInt();
			System.out.println("�Է¹��� ����: " + n);
		} catch (InputException e) {
			System.out.println("���� �޽���: " + e.getMessage());
		}
	}
}
