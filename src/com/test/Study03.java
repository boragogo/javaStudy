package com.test;

import java.util.Scanner;	// Scanner 클래스 호출

public class Study03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성
		
		// 거스름돈 입력해서 금액권별 화폐 개수 계산하기
		
		System.out.println("거스름돈을 입력하세요.");
		
		int change = sc.nextInt();
		
		System.out.println("5만원 " + (change / 50000) + "장");
		change = change % 50000;
		
		System.out.println("1만원 " + (change / 10000) + "장");
		change = change % 10000;
		
		System.out.println("5천원 " + (change / 5000) + "장");
		change = change % 5000;
		
		System.out.println("1천원 " + (change / 1000) + "장");
		change = change % 1000;
		
		System.out.println("500원 " + (change / 500) + "개");
		change = change % 500;
		
		System.out.println("100원 " + (change / 100) + "개");
		change = change % 100;
		
		System.out.println("50원 " + (change / 50) + "개");
		change = change % 50;
		
		System.out.println("10원 " + (change / 10) + "개");
		change = change % 10;
	}

}
