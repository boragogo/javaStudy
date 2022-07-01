package com.test;

import java.util.Scanner;	// Scanner 클래스 호출

public class Study10 {

	public static void main(String[] args) {
		
		// 여러명이 음식을 주문했을 때 1) 총 주문 금액, 2) 1인당 지불 금액
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사람 수 ");
		int member = sc.nextInt();		// 점심 식사 인원
		
		System.out.println("김치찌개 주문 수 :");
		int orderA = sc.nextInt();		// 김치찌개 주문 수

		System.out.println("제육볶음 주문 수 :");
		int orderB = sc.nextInt();		// 제육볶음 주문 수

		System.out.println("된장찌개 주문 수 :");
		int orderC = sc.nextInt();		// 된장찌개 주문 수
				
		int total = (orderA * 5000) + (orderB * 6000) + (orderC * 4000);	// 총 합계
		int each = total / member;		// 1인당 지불금액
		
		System.out.println("총 금액 : \n" + total);
		System.out.println("1인당 지불 금액 : \n" + each);
	}

}
