package oop;

import java.util.HashMap;

public class HashCode {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(3, 2);

		Rectangle rect2 = new Rectangle(3, 2);
		println(rect2, "equals", rect1, rect2.equals(rect1));

		Rectangle rect3 = new Rectangle(2, 3);
		println(rect3, "equals", rect1, rect3.equals(rect1));
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key1", "value3"); // µ¤¾î¾º¿ò
	}

	public static void println(Object... args) {
		for (Object s : args) {
			System.out.print(s);
			System.out.print(' ');
		}
		System.out.println();
	}
}
