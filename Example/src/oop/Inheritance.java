package oop;


public class Inheritance {

	/** ���簢�� **/
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
			System.out.printf("%s�� ����: %.1f\n", this, area());
		}
		
		@Override
		public String toString() {
			return String.format("���ΰ� %.1f�̰� ���ΰ� %.1f�� ���簢��", width, height);
		}
	}

	/** ���簢�� **/
	static class Square extends Rectangle {
		
		Square(double width) {
			super(width, width);
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
