package com.javastudy.ch04.overloading;

public class MemberPrint {

	public static void main(String[] args) {

		Member member1 = new Member("홍길동", 25);
		member1.setId("hong");
		member1.setPw("1234");
		member1.setGender("남성");
		member1.setAddress("서울 구로구 구로동 1번지");
	
		Member member2 = new Member("이순신", 30, "leesunshin", "4321");
		member2.setGender("남성");
		member2.setAddress("서울 강서구 화곡동 3번지");
		
		Member member3 = new Member("유관순", 35, "midas", "1111", "여성", "경기도 부천시 오정구 고강동");
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
	}
	
	

}
