package com.javastudy.ch03.If;

public class Exercise3_1 {

	public static void main(String[] args) {

		int age = 17;
		String msg = "";
		
		if (age > 19) {
			msg += "성인";
			System.out.println("나이가 " + age + "세로 " + msg + "입니다.");
			return;
			
		}else if(age >16 && age <= 19) {
			msg += "고등학생";
			System.out.println("나이가 " + age + "세로 " + msg + "입니다.");
			return;
			
		}else if(age > 13 && age <= 16) {
			msg += "중학생";
			System.out.println("나이가 " + age + "세로 " + msg + "입니다.");
			return;
			
		}else if(age > 7 && age <= 13) {
			msg += "초등학생";
			System.out.println("나이가 " + age + "세로 " + msg + "입니다.");
			return;
			
		}else if(age > 0 && age <= 6) {
			msg += "미취학생";
			System.out.println("나이가 " + age + "세로 " + msg + "입니다.");
			return;
		}

}
}