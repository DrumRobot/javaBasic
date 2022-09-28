package oop;

/** 직사각형 **/
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
		System.out.printf("%s의 넓이: %.1f\n", this, area());
	}

	@Override
	public String toString() {
		return String.format("가로가 %.1f이고 세로가 %.1f인 직사각형", width, height);
	}
}
