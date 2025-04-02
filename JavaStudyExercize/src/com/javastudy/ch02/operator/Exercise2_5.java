package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 한 자를 입력해주세요 : ");
		
		String input = sc.next();
		
		char ch = input.charAt(0);
		System.out.print("첫 번째 문자 : " + ch + "는 ");
		System.out.println(ch >= 'a' && ch <= 'z' ? "소문자 입니다." : "대문자 입니다.");

		
	}

}
