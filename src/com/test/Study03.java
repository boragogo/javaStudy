package com.test;

import java.util.Scanner;		// Scanner class 호출

public class Study03 {

	public static void main(String[] args) {
		
		// 영문 이름 입력받아 각 문자에 부여된 숫자들의 합계 구한 후, 그 합계가 소수인지 확인하기
		
		// scanner 객체 생성
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("영문 이름을 입력하세요");
				
		// 문자열을 키보드로부터 입력받음
		String str = sc.nextLine();	
		
		// 소수 여부 확인
		if(isPrimeString(str)) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
	
	private static int getSumOfAlphaNumeric(String str) {
		str = str.toUpperCase();
		
		// 문자열 해당숫자 총 합계
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 64;
			
			System.out.print(num + " ");
			
			if(num > 0 && num < 27) {
				sum += num;
			}
		}
		System.out.println("합계: " + sum);
		return sum;
	}
	
	private static boolean isPrimeNumber(int num) {
		
		// 제곱근 구하기
		int sqrt = (int)Math.sqrt(num);
		
		for(int j = 2; j <= sqrt; j++) {
			if(num % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPrimeString(String str) {
		return isPrimeNumber(getSumOfAlphaNumeric(str));
	}
}
