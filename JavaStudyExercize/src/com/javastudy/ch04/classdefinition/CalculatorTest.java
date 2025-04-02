package com.javastudy.ch04.classdefinition;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		System.out.println("[실행결과]");
		System.out.println("3 + 5 = " + calc.add(3, 5));
		System.out.println("100 - 78 = " + calc.sub(100, 78) );
		System.out.println("101 x 23 = " + calc.mul(101, 23));
		System.out.println("400 / 25 = " + calc.div(400, 25));
		
	}

}
