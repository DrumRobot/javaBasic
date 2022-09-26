package oop;

class Person {
	String name;
	int age;
	String address;

	public void print() {
		System.out.printf("name: %s, age: %d address: %s\n", name, age, address);
	}
}

/**
 * 링크: <a href="https://fors.tistory.com/65"> 객체지향 프로그래밍 / JVM 메모리 스택, 힙, 클래스 영역
 * </a>
 */
public class References {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.name = "이름 1";
		p2.name = "이름 2";
		p3.name = "이름 3";
		init(p1);
		p1.print();
		p2.print();
		p3.print();
	}

	public static void init(Person person) {
		person.age = 32;
		person.address = "청주";
	}
}
