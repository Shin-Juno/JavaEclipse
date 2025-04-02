package com.javastudy.ch05.inheritance;

public class Animal {

	private String name;
	private String species;
	private int age;
	private String sound;
	
	public Animal() {}
	
	public Animal(String name, String species, int age, String sound) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.sound = sound;
	}
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void eat() {
		System.out.println(name + "은(는) " + species + "로 사료를 먹습니다.");
	}
	
	public void sound() {
		System.out.println(name + "은(는) " + species + "로" + sound + " 짖습니다.");
	}
	
	@Override
	public String toString() {
		return name + "은(는) " + species + "로 " + age + "살 입니다.";
	}
	
	
}
