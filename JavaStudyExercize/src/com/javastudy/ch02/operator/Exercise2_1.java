package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 4자리로 입력해주세요 : ");
		
		int birth = sc.nextInt();
		
		int age = 2025 - birth + 1;
		System.out.println("당신은 " + birth + "년 생으로 현재 " + age + "세 입니다.");
				
	}

}
