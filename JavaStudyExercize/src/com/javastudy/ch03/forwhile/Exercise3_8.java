package com.javastudy.ch03.forwhile;

public class Exercise3_8 {

	public static void main(String[] args) {
		 String[][] parks = {
		            {"서울지역", "관악산", "도봉산", "북한산"},
		            {"중부지역", "계룡산", "월악산", "속리산"},
		            {"남부지역", "내장산", "지리산", "가야산"},
		            {"태백지역", "설악산", "오대산", "태백산"}
		        };
		 System.out.println("   ### 지역별 국립공원 ###");

		        // 배열을 순회하며 출력
		        for (int i = 0; i < parks.length; i++) {
		            System.out.print(parks[i][0] + " : "); // 지역명 출력
		            for (int j = 1; j < parks[i].length; j++) {
		                System.out.print(parks[i][j]); // 국립공원 출력
		                if (j < parks[i].length - 1) {
		                    System.out.print(", "); // 마지막 요소가 아니면 쉼표 추가
		                }
		            }
		            System.out.println(); // 줄 바꿈
		        }

	}

}
