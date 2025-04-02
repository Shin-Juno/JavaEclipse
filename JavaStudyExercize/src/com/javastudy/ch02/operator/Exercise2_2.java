package com.javastudy.ch02.operator;

public class Exercise2_2 {

	public static void main(String[] args) {

		int x = 15;
		int y = 7;
		
		float f1 = 15.0f;
		float f2 = 7.0f;
		
		System.out.println("x, y를 사칙 연산한 결과와 나머지 연산한 결과");
		System.out.println("15 + 7 = " + (x + y));
		System.out.println("15 - 7 = " + (x - y));
		System.out.println("15 / 7 = " + (x / y));
		System.out.println("15 * 7 = " + (x * y));
		System.out.println("15 % 7 = " + (x % y));
		System.out.println();

		System.out.println("f1, f2를 나눗셈, 곱셈, 나머지 연산한 결과");
		System.out.println("15.0 / 7.0 = " + (f1 / f2));
		System.out.println("15.0 * 7.0 = " + (f1 * f2));
		System.out.println("15.0 % 7.0 = " + (f1 % f2));
		
	}

}
