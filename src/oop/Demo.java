package oop;

class Person{
	
		String name;
		String email;
		String phone;
		
		void walk() {
			System.out.println(name + "is walking");
		}
		
		void eat() {
			System.out.println(email);
		}
		
		void sleep() {
			System.out.println(name + " is sleeping");
		}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "22222222";
		
		person1.walk();
		person1.sleep();
		person1.eat();

	}

}
