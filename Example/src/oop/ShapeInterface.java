package oop;

public class ShapeInterface {
	
	interface Shape {
		double area();

		default void print() {
			System.out.printf("%s의 넓이: %.1f\n", this, area());
		}
	}

	/** 직사각형 **/
	static class Rectangle implements Shape {
		double width;
		double height;

		Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		public double area() {
			return width * height;
		}

		@Override
		public int hashCode() {
			int a = ((Double) width).hashCode();
			int b = ((Double) height).hashCode();
			return String.format("%d%d", a, b).hashCode();
		}

		@Override
		public String toString() {
			return String.format("가로가 %.1f이고 세로가 %.1f인 직사각형", width, height);
		}
	}

	/** 정사각형 **/
	static class Square implements Shape {
		double width;

		Square(double width) {
			this.width = width;
		}

		@Override
		public double area() {
			return width * width;
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
