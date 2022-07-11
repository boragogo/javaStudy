package com.test;

import java.util.Scanner; // Scanner 클래스 호출

public class Study01 {

	public static void main(String[] args) {
		
		// 닭과 개의 총 다리수, 총 마리 수 입력했을 때
		// 닭과 개는 각각 몇 마리인지 구하기 
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		// Scanner 객체 생성
		
		// case 1
		
		int aniSum = 0;				// 닭 + 개 총 마리 수 
		
		while(!checkCondition1(aniSum)) {			
			System.out.println("개와 닭의 총 마리수를 입력하세요. (1 이상의 값)");
			System.out.print(">> ");
			aniSum = scan.nextInt();		
		}
		
		int legSum = 0;				// 닭 + 개 총 다리 수
		
		while(!checkCondition1(legSum)) {			
			System.out.println("개와 닭의 총 다리수를 입력하세요. (1 이상의 값)");
			System.out.print(">> ");
			legSum = scan.nextInt();		
		}
		

		// case 2
		
//		int aniSum = 0;				// 닭 + 개 총 마리 수 
//		
//		System.out.println("개와 닭의 총 마리수를 입력하세요.");
//		System.out.print(">> ");
//		
//		do {
//			aniSum = scan.nextInt();
//			
//			if(aniSum < 0) {
//				System.out.println("0 이상의 숫자를 입력하세요 ");
//				System.out.print(">> ");			
//			}
//		} while (aniSum < 0);		
//		
//		int legSum = 0;				// 닭 + 개 총 다리 수
//	
//		System.out.println("개와 닭의 총 다리수를 입력하세요.");
//		System.out.print(">> ");
//		
//		do {
//			legSum = scan.nextInt();
//			
//			if(legSum < 0 || legSum % 2 != 0) {
//				System.out.println("0 이상의 짝수를 입력하세요 ");
//				System.out.print(">> ");			
//			}
//		} while (legSum < 0 || legSum % 2 != 0);	
		
		
		int x = 0;					// 개 마리 수
		int y = 0;					// 닭 마리 수
		int dogLeg = 4;				// 개 다리 수
		int chkLeg = 2;				// 닭 다리 수
		
		boolean flag = false;
				
		for(int i = 0; i <= aniSum; i++) {
			if(dogLeg * i + chkLeg * (aniSum - i) == legSum) {				
				
				x = i;
				y = aniSum - i;
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("개는 " + x + "마리");
			System.out.println("닭은 " + y + "마리");
		} else {
			System.out.println("해당되는 경우가 없습니다.");
		}		
	}
	
	public static boolean checkCondition1(int x) {
		if(x<1) return false;
		else return true;
	}	
}
