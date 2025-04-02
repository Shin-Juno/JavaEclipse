package com.javastudy.ch03.If;

import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요");
		
		int score = sc.nextInt();
		char grade = ' ';
		
		switch (score / 10) {
        case 10:
        case 9 : grade = 'A';
            break;
        case 8 : grade = 'B';
            break;
        case 7 : grade = 'C';
            break;
        case 6 : grade = 'D';
            break;
        default : grade = 'F';
    }

    System.out.printf("당신의 점수는 %d점으로 %c학점입니다.%n", score, grade);
    sc.close();
		
	}

}
