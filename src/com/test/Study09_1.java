package com.test;

import java.util.Scanner;

public class Study09_1 {

	// 1 ~ 100 중 난수 1개를 n번안에 맞추기 => 수정 코드
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int randomNum = (int)(Math.random() * 100) + 1;		// 난수 생성
		int guessNum = 0;									// 입력받을 번호
		
		final int NUMBER_OF_TIMES = 8;						// 번호 입력 횟수
		int i = 0;											// 반복 회수
		
		System.out.println("숫자를 맞춰보세요.");
		System.out.println("기회는 " + NUMBER_OF_TIMES + "번 입니다.");
		
		// 입력번호와 난수 비교 확인
		do {
			i++;
			guessNum = sc.nextInt();
			
			int comp = randomNum > guessNum ? 1 : randomNum < guessNum ? -1 : 0;
			
			switch(comp) {
			case 1 :
				System.out.println("크다");
				break;
			case -1 :
				System.out.println("작다");
				break;
			case 0 : 
				System.out.println("정답");
				break;
			}
		} while (i < NUMBER_OF_TIMES && randomNum != guessNum);
		
		// 기회동안 못 맞췄을 경우
		if (i == NUMBER_OF_TIMES && randomNum != guessNum) {
			System.out.print("정답은 " + randomNum + "입니다.");
		} 
		
	}
	
}
