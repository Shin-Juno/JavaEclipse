package com.javastudy.ch04.classdefinition;

public class StudentInfoPrint {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "강바람";
		s1.age = 20;
		s1.gender = "남성";
		s1.address = "인천시 부평구 부개동";
		
		Student s2 = new Student();
		s2.name = "오빛나";
		s2.age = 21;
		s2.gender = "여성";
		s2.address = "서울시 영등포구 당산동";
		
		Student s3 = new Student();
		s3.name = "어머나";
		s3.age = 25;
		s3.gender = "여성";
		s3.address = "부산시 해운대구 반여동";
		
		System.out.println("학생 정보 출력(클래스 정의)");
		System.out.printf("이름 : %s, 나이 : %s, 성별 : %s, 주소 : %s\n"
				,s1.name, s1.age, s1.gender, s1.address);
		System.out.printf("이름 : %s, 나이 : %s, 성별 : %s, 주소 : %s\n"
				,s2.name, s2.age, s2.gender, s2.address);
		System.out.printf("이름 : %s, 나이 : %s, 성별 : %s, 주소 : %s\n"
				,s3.name, s3.age, s3.gender, s3.address);
		
	}

}
