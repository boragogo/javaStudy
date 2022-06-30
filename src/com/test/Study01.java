package com.test;

import java.util.Scanner; // Scanner 클래스 호출

public class Study01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		// Scanner 객체 생성
		
		boolean flag = true;
		
		System.out.println("개와 닭의 총 마리수를 입력하세요.");
		System.out.print(">> ");
		
		int aniSum = 0;				// 닭 + 개 총 마리 수 
		
		while(flag) {
			aniSum = scan.nextInt();
			
			if(aniSum < 0) {
				System.out.println("0 이상의 수를 입력하세요 ");
				System.out.print(">> ");
				continue;				
			}
			break;
		} 
		
		System.out.println("개와 닭의 총 다리수를 입력하세요.");
		System.out.print(">> ");
		
		int legSum = 0;				// 닭 + 개 총 다리 수
		
		while(flag) {
			legSum = scan.nextInt();
			
			if(legSum < 0 || legSum % 2 != 0) {
				System.out.println("0 이상의 짝수를 입력하세요 ");
				System.out.print(">> ");
				continue;				
			}
			break;
		}
				
		int x = 0;					// 개 마리 수
		int y = 0;					// 닭 마리 수
		int dogLeg = 4;				// 개 다리 수
		int chkLeg = 2;				// 닭 다리 수
				
		for(int i = 0; i <= aniSum; i++) {
			if(dogLeg * i + chkLeg * (aniSum - i) == legSum) {				
				
				x = i;
				y = aniSum - i;
				
				System.out.println("개는 " + x + "마리");
				System.out.println("닭은 " + y + "마리");
			}
		}
	}
	
}
