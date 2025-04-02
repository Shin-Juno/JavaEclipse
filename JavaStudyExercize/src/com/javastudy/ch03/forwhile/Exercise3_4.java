package com.javastudy.ch03.forwhile;

public class Exercise3_4 {

	public static void main(String[] args) {

		int count1 = 0;
		int count2 = 0;
		
		for(int i = 33; i <=235; i++) {
			if(i % 2 != 0) {
				count1 += 1;
			}else {
				count2 += 1;
			}
		}
		
		System.out.println("33 ~ 235까지 홀수의 개수 : " + count1);
		System.out.println("33 ~ 235까지 짝수의 개수 : " + count2);
	}

}
