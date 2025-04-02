package com.javastudy.ch05.inheritance;

public class Human extends Animal {
	private String hobby;
	
	public Human(String name, int age, String hobby) {
		super(name, "사람", age, "엉엉");
		this.hobby = hobby;
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "는 " + getSpecies() + "으로 아침을 먹습니다.");
	}
	
	@Override
	public void sound() {
		System.out.println(getName() + "는 " + getSpecies() + "으로 " + getSound() + " 웁니다.");
	}
	@Override
	public String toString() {
		return getName() + "는 " + getSpecies() + "으로 " + getAge()
					+ "살 이며 취미는 " + hobby + " 입니다.";
	}
}
