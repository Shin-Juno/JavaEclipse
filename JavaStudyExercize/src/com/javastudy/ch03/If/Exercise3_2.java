package com.javastudy.ch03.If;

public class Exercise3_2 {

	public static void main(String[] args) {

		int age = 9;
		int charge = 0;
		String msg = "";
		
		if (age > 19) {
			charge += 2000;
			msg += "성인";
			System.out.println(age + "살로 " + msg + "이며, 입장료는 " + charge + "원 입니다.");
			return;
			
		}else if(age >13 && age <= 19) {
			charge += 1000;
			msg += "중, 고등학생";
			System.out.println(age + "살로 " + msg + "이며, 입장료는 " + charge + "원 입니다.");
			return;
			
		}else if(age > 7 && age <= 13) {
			charge += 500;
			msg += "초등학생";
			System.out.println(age + "살로 " + msg + "이며, 입장료는 " + charge + "원 입니다.");
			return;
			
		}else if(age > 0 && age <= 6) {
			charge += 0;
			msg += "미취학생";
			System.out.println(age + "살로 " + msg + "이며, 입장료는 " + charge + "원 입니다.");
			return;
		}
	}

}
