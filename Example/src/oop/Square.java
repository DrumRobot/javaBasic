package oop;

/** ���簢�� */
public class Square extends Rectangle {
	
	Square(double width) {
		super(width, width);
	}
	
	@Override
	public String toString() {
		return String.format("�� ���� %.1f�� ���簢��", width);
	}
}
