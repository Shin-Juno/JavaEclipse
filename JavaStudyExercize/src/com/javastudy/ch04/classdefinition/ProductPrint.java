package com.javastudy.ch04.classdefinition;

public class ProductPrint {

	public static void main(String[] args) {
		 Product product1 = new Product("아메리카노 1+1",
				 2990, "스타벅스", "스타벅스 오리지날 아메리카노 커피 1+1");
	     Product product2 = new Product("뉴그랜저",
	    		 32500000, "현대자동차", "3000cc 동급 최강 승용차");
	     Product product3 = new Product("데스크탑5",
	    		 799000, "삼성전자", "CPU 6코어 i5 10400F 4.3GHz");
	        
	     System.out.println("### 상품 리스트 ###");
	     System.out.println(product1);
	     System.out.println(product2);
	     System.out.println(product3);
	}

}
