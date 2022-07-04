package com.test;

import java.util.Scanner;		// Scanner class 호출

public class Study13 {

	public static void main(String[] args) {
		
		// 영문 이름 입력받아 각 문자에 부여된 숫자들의 합계 구한 후, 그 합계가 소수인지 확인하기
		
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성
		
		System.out.println("이름(영문)을 입력하세요");
				
		// 영문 이름 
		// 대문자 변환 & 문자열 공백 제거
		String str = sc.nextLine().toUpperCase().replace(" ", "");	
		
		// System.out.println(str);
		
		int sum = 0;		// 총 합계
		
		// 문자별 숫자와 총 합계 구하기
		for(int i = 0; i < str.length(); i++) {
		
			int num = str.charAt(i) - 64;		// A = 1, ... 
		
			System.out.print(num + " ");
			
			if (num > 0 && num < 27) {
				sum += num;
			}			
		}
		
		System.out.println("\n합계 : " + sum);		
				
		// 총 합계의 소수 여부 확인
		int sumSqrt = (int)Math.sqrt(sum);
		
		for(int j = 2; j <= sumSqrt; j++) {
			
		}
	}
	

}
