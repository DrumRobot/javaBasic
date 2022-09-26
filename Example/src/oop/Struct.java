package oop;


public class Struct {

	/** ���簢�� **/
	static class Rectangle {
		double width;
		double height;
	}

	/** ���簢�� **/
	static class Square {
		double width;
	}
	
	public static double area(Rectangle rect) {
		return rect.width * rect.height;
	}
	
	public static double area(Square square) {
		return square.width * square.width;
	}
	
	public static void print(Rectangle rect) {
		System.out.printf("���ΰ� %f�̰� ���ΰ� %f�� ���簢���� ����: %f", rect.width, rect.height, area(rect));
	}
	
	public static void print(Square square) {
		System.out.printf("�� ���� %f�� ���簢���� ����: %f", square.width, area(square));
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.width = 2;
		rect.height = 3;
		print(rect);
		
		Square square = new Square();
		square.width = 4;
		print(square);
	}
}
