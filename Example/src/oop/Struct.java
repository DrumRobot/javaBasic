package oop;


public class Struct {

	/** 직사각형 **/
	static class Rectangle {
		double width;
		double height;
	}

	/** 정사각형 **/
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
		System.out.printf("가로가 %f이고 세로가 %f인 직사각형의 넓이: %f", rect.width, rect.height, area(rect));
	}
	
	public static void print(Square square) {
		System.out.printf("한 변이 %f인 정사각형의 넓이: %f", square.width, area(square));
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
