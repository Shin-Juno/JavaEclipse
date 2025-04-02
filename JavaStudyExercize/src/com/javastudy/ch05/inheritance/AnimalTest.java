package com.javastudy.ch05.inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal dog = new Dog("바오", 1);
			dog.eat();
			dog.sound();
			System.out.println(dog);
			System.out.println();
			
		Animal cat = new Cat("나비", 3);
			cat.eat();
			cat.sound();
			System.out.println(cat);
			System.out.println();
			
		Animal human = new Human("준호", 26, "코딩");
			human.eat();
			System.out.println(human);
			human.sound();
			System.out.println();
		
	}

}
