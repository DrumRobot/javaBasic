package oop;

public class Struct {
	interface Shape {

	}

	/** 직사각형 **/
	static class Rectangle implements Shape {
		double width;
		double height;
	}

	/** 정사각형 **/
	static class Square implements Shape {
		double width;
	}

	public static double area(Shape obj) {
		if (obj instanceof Rectangle) {
			Rectangle rect = (Rectangle) obj;
			return rect.width * rect.height;
		} else if (obj instanceof Square) {
			Square square = (Square) obj;
			return square.width * square.width;
		}
		return 0;
	}

	public static void print(Rectangle rect) {
		System.out.printf("가로가 %f이고 세로가 %f인 직사각형의 넓이: %f", rect.width, rect.height, area(rect));
	}

	public static void print(Square square) {
		System.out.printf("한 변이 %f인 정사각형의 넓이: %f", square.width, area(square));
	}

	public static void setSize(Rectangle rect, double width, double height) {
		rect.width = width;
		rect.height = height;
	}

	public static void setWidth(Square square, double width) {
		square.width = width;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		setSize(rect, 2, 3);
		print(rect);

		Square square = new Square();
		setWidth(square, 4);
		print(square);
	}
}
