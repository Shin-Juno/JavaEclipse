package com.javastudy.ch04.overloading;

public class Member {
	private String name;
	private int age;
	private String id;
	private String pw;
	private String gender;
	private String address;
	
	//생성자 1 (이름, 나이)
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//생성자 2 (이름, 나이, 아이디, 비밀번호)
	public Member(String name, int age, String id, String pw) {
		this(name, age);
		this.id = id;
		this.pw = pw;
	}
	
	//생성자 3 (전체 속성)
	public Member(String name, int age, String id, String pw, String gender, String address) {
		this(name, age, id, pw);
		this.gender = gender;
		this.address = address;
	}
		
	//Getter, Setter 메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//toString() 메서드 오버라이딩
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 아이디 : " + id +
				", 비밀번호 : " + pw + ", 성별 : " + gender + ", 주소 : " + address;
	}
}
