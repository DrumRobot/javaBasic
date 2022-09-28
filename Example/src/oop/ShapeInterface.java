package oop;

public class ShapeInterface {
	
	interface Shape {
		double area();

		default void print() {
			System.out.printf("%s�� ����: %.1f\n", this, area());
		}
	}

	/** ���簢�� **/
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
			return String.format("���ΰ� %.1f�̰� ���ΰ� %.1f�� ���簢��", width, height);
		}
	}

	/** ���簢�� **/
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
			return String.format("�� ���� %.1f�� ���簢��", width);
		}
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2, 3);
		rect.print();

		Square square = new Square(4);
		square.print();
	}
}
