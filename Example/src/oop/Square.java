package oop;

/** 정사각형 */
public class Square extends Rectangle {
	
	Square(double width) {
		super(width, width);
	}
	
	@Override
	public String toString() {
		return String.format("한 변이 %.1f인 정사각형", width);
	}
}
