package com.test;

import java.util.Scanner;		// Scanner 클래스 호출

public class Study04 {

	public static void main(String[] args) {
		
		// 주급 계산하기
		// 하루 당 근무시간과 시간당 급여액을 입력받아 주급 계산하기
		
		Scanner sc = new Scanner(System.in);		// scanner 객체 생성
		
		System.out.println("하루 근무시간을 입력하세요.");
		int workTime = sc.nextInt();
		
		System.out.println("시간당 급여액을 입력하세요.");
		int hourWage = sc.nextInt();
		
		// 주급 계산
		System.out.println("주급은 " + (workTime * hourWage * 7) + "원 입니다." );
		
	}

}
