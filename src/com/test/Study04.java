package com.test;

import java.util.Scanner;

public class Study04 {
	
	// 피보나치 수열 1 ~ n번째까지 출력하기
	
	public static int[] pibonacchi(int num) {
		int[] arr = new int[num];
		
		
		for(int i = 0; i < arr.length; i++) {
			if( i < 2 )
				arr[i] = 1;
			else
				arr[i] = arr[i-1] + arr[i-2];
		}
        
        return arr; 
	}

	public static void main(String[] args) {
		
		// scanner 객체 생성
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 :");
		
		// 문자열을 키보드로부터 입력받음
		int num = sc.nextInt();
		int[] ref;
		
		ref = pibonacchi(num);
		
		// n번째까지 피보나치 수열 출력
		for(int i : ref) {
			System.out.print(i + " ");
		}		
	}
}
