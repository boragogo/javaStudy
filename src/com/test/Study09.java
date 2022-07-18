package com.test;

import java.util.Scanner;

public class Study09 {

	// 1 ~ 100 중 난수 1개를 n번안에 맞추기
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// 번호 입력 횟수
		final int NUMBER_OF_TIMES = 8;
		
		// 난수 생성하기
		int randomNum = (int)(Math.random() * 100) + 1;
		
		System.out.println("숫자를 맞춰보세요.");
		System.out.println("기회는 " + NUMBER_OF_TIMES + "번 입니다.");
		
		// 사용자 숫자 입력
		int guessNum = sc.nextInt();
		
		// 입력받은 숫자와 난수 비교
		for(int i = 1; i <= NUMBER_OF_TIMES; i++) {
			
			if (i == NUMBER_OF_TIMES && randomNum != guessNum) {
				System.out.println( i + "번째 시도] 숫자를 맞추지 못했습니다." );
				System.out.println( "정답은 " + randomNum + "입니다." );
			} else if( randomNum < guessNum ) {
				System.out.println( i + "번째 시도] " + guessNum + "보다 작습니다." );
				guessNum = sc.nextInt();
			} else if( randomNum > guessNum ) {
				System.out.println( i + "번째 시도] " + guessNum + "보다 큽니다." );
				guessNum = sc.nextInt();
			} else {
				System.out.println( i + "번째 시도] 정답입니다." );
				break;
			}
		}
	}
	
}
