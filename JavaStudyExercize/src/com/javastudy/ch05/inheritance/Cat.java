package com.javastudy.ch05.inheritance;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, "고양이", age, " 야오옹~");
	}
	
	@Override
	public void sound() {
		System.out.println(getName() + "은(는) " + getSpecies() + "로" + getSound() + " 웁니다.");
	}
	
}
