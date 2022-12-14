package oop;

public class Inheritance {

	/** 직사각형 **/
	static class Rectangle {
		double width;
		double height;

		Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		public double area() {
			return width * height;
		}

		public void print() {
			System.out.printf("%s의 넓이: %.1f\n", this, area());
		}

		@Override
		public String toString() {
			return String.format("가로가 %.1f이고 세로가 %.1f인 직사각형", width, height);
		}
	}

	/** 정사각형 **/
	static class Square extends Rectangle {

		Square(double width) {
			super(width, width);
		}

		@Override
		public void print() {
			super.print();
			System.out.printf("%s의 넓이: %.1f\n", super.toString(), area());
		}

		@Override
		public String toString() {
			return String.format("한 변이 %.1f인 정사각형", width);
		}
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2, 3);
		rect.print();

		Square square = new Square(4);
		square.print();
	}
}
