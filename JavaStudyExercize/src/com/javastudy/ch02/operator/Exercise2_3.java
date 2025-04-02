package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Exercise2_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("입력된 숫자는 : " + num + "(으)로 짝수입니다.");
		}else {
			System.out.println("입력된 숫자는 : " + num + "(으)로 홀수입니다.");
		}

		
	}

}
