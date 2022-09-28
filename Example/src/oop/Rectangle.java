package oop;

/** ���簢�� **/
public class Rectangle {
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
	public boolean equals(Object obj) {
		if (hashCode() != obj.hashCode()) {
			return false;
		}
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return this.width == other.width && this.height == other.height;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int a = ((Double) width).hashCode();
		int b = ((Double) height).hashCode();
		return String.format("%d%d", a, b).hashCode();
	}
	
	public void print() {
		System.out.printf("%s�� ����: %.1f\n", this, area());
	}

	@Override
	public String toString() {
		return String.format("���ΰ� %.1f�̰� ���ΰ� %.1f�� ���簢��", width, height);
	}
}
