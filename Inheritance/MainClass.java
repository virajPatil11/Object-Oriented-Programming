package Basics;

class Person{
	String name;
	int age;
	
	static int count;
	//public Person() {
		//count++;
		//System.out.println("Creating an object");
	//}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps.");
	}
}


class Developer extends Person{
	public Developer(int age, String name) {
		super(age,name); // use to call parent constructor
	}
	void walk() {
		System.out.println("Developer " + name + " is walking.");
	}
}

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person(20, "Viraj");
		Developer d1 = new Developer(23, "Rutik");
		d1.walk();
		d1.eat();
		d1.walk(100);
		
	}
}
