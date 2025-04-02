package com.javastudy.ch03.forwhile;

public class Exercise3_5 {

	public static void main(String[] args) {

		String nums = "";
		int count = 0;
		
		for(int i = 100; i <=150; i++) {
			if(i % 7 ==0) {
				nums += (150 - 7 >=i) ? i + ", " : i;
				count +=1;
			}
		}
		System.out.println("100부터 ~ 150까지 7의 배수 : " + nums);
		System.out.println("100부터 ~ 150까지 7의 배수의 개수 : " + count);
	}

}
