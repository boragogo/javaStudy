package com.test;

import java.util.Scanner;

public class Study09 {

	public static void main(String[] args) {
		
		// 직각 삼각형 빗변의 길이 구하기
		// 공식 c*c = a*a + b*b 

		Scanner sc = new Scanner(System.in);			// scanner 객체 생성
		
		System.out.println("한 변의 길이 입력(빗변 제외)");
		int a = Integer.parseInt(sc.nextLine());	// a변의 길이 
		
		System.out.println("또다른 변의 길이 입력(빗변 제외)");
		int b = Integer.parseInt(sc.nextLine());	// b변의 길이
		
		int c = 0;
		c = (int)Math.sqrt(a*a + b*b);
		
		System.out.println("빗변 : " + c);
	}
}
