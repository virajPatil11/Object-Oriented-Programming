package Basics;

//classes
class Person{
	String name;
	int age;
	
	//methods
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

public class MainClass {
	public static void main(String[] args) {
		
		//object of class person
		Person p1 = new Person();
		p1.name = "viraj";
		p1.age = 20;
		
		Person p2 = new Person();
		p2.name = "rutik";
		p2.age = 21;
		//System.out.println(p1.name + " " + p1.age);
		//System.out.println(p2.name + " "+ p2.age);
		
		p1.eat();
		p2.walk();
		p1.walk(10);
		
	}
}
