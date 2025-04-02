package com.javastudy.ch03.forwhile;

public class Exercise3_7 {

	public static void main(String[] args) {

		String nums = "";
		
		for (int i = 1; i <= 60; i++) {
			if(i % 10 != 0) {
				nums += (i + ", ");
			}else {
				nums += (i + "\n");
			}
		}
		System.out.println(nums);
	}

}
