package com.javastudy.ch03.forwhile;

public class Exercise3_6 {

	public static void main(String[] args) {

		int count = 0;
		int sum = 0;
		String nums = "";
		
		for(int i = 50; i<=100; i++) {
			if (i % 3 == 0 && i % 6 != 0) {
				nums += (100-3>= i) ? i + ", " : i;
				count += 1;
				sum += i;
			}
		}
		System.out.println("### 50부터 ~ 100까지 3의 배수이면서 6의 배수 구하기###");
		System.out.println("");
		System.out.println("3의 배수이면서 6의 배수가 아닌 수 : " + nums);
		System.out.println("3의 배수이면서 6의 배수가 아닌 정수의 개수 : " + count);
		System.out.println("3의 배수이면서 6의 배수가 아닌 정수의 합 : " + sum);
	}

}
