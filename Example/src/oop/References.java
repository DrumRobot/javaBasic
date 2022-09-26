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
 * ��ũ: <a href="https://fors.tistory.com/65"> ��ü���� ���α׷��� / JVM �޸� ����, ��, Ŭ���� ����
 * </a>
 */
public class References {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.name = "�̸� 1";
		p2.name = "�̸� 2";
		p3.name = "�̸� 3";
		init(p1);
		p1.print();
		p2.print();
		p3.print();
	}

	public static void init(Person person) {
		person.age = 32;
		person.address = "û��";
	}
}
