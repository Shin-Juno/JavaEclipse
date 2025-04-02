package com.javastudy.ch07.objectmethods;

import java.util.Objects;

class Member implements Cloneable {
	private String name;
	private int age;
	private String gender;
	
	public Member() {}
	
	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return name + "(" + age + "-" + gender + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(obj == null || getClass() !=obj.getClass()) return false;
		
		Member member = (Member) obj;
		return age == member.age && 
				Objects.equals(name, member.name) &&
				Objects.equals(gender, member.gender);
	}
	
}

public class MemberUserExam {

	public static void main(String[] args) {

		Member m1 = new Member("홍길동", 25, "남성");
		Member m2 = new Member("홍길동", 25, "남성");
		
		 System.out.println("m1을 이용한 정보출력하기 :");
	        System.out.println(m1.getClass().getName() + "@" + Integer.toHexString(m1.hashCode()));

	        // 2. m1과 m2의 해시코드 비교 (10진수)
	        System.out.println("p1과 p2의 해시코드 비교 : " + m1.hashCode() + " - " + m2.hashCode());

	        // 3. m1과 m2 비교하여 출력
	        if (m1.equals(m2)) {
	            System.out.println(m1 + " : " + m2 + "은 같은 사람입니다.");
	        } else {
	            System.out.println(m1 + " : " + m2 + "은 다른 사람입니다.");
	        }
		
	}

}
