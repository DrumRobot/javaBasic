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
			System.out.printf("���ΰ� %.1f�̰� ���ΰ� %.1f�� ���簢���� ����: %.1f\n", width, height, area());		}
	}

	/** ���簢�� **/
	static class Square extends Rectangle {
		
		Square(double width) {
			super(width, width);
		}
		
		public void print() {
			System.out.printf("�� ���� %.1f�� ���簢���� ����: %.1f\n", width, area());
		}
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2, 3);
		rect.print();
		
		Square square = new Square(4);
		square.print();
	}
}
