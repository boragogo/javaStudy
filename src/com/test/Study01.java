package com.test;

import java.util.Scanner; // Scanner 클래스 호출

public class Study01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		// Scanner 객체 생성
		
		System.out.println("개와 닭의 총 마리수를 입력하세요.");
		System.out.print(">> ");
		
		int anySum = scan.nextInt();			// 닭 + 개 총 마리 수 
		
		System.out.println("개와 닭의 총 다리수를 입력하세요.");
		System.out.print(">> ");
		
		int legSum = scan.nextInt();				// 닭 + 개 총 다리 수
		
		int x = 0;				// 개 마리 수
		int y = 0;				// 닭 마리 수
		int dogLeg = 4;			// 개 다리 수
		int chkLeg = 2;			// 닭 다리 수
				
		for(int i = 0; i <= anySum; i++) {
			if(dogLeg * i + chkLeg * (anySum - i) == legSum) {				
				
				x = i;
				y = anySum - i;
				
				System.out.println("개는 " + x + "마리");
				System.out.println("닭은 " + y + "마리");
			}
		}
	}
	
}
