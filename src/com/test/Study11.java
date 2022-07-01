package com.test;

import java.util.Scanner;		// Scanner 클래스 호출

public class Study11 {

	public static void main(String[] args) {
		
		// 서울->부산 시속 80킬로미터로 달렸을 경우 몇시간 몇분 걸리나?
		// 서울-부산 거리 약 430km
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("속도 입력(시속)");
		int spd = sc.nextInt();				// 속도 입력
		
		int hour;		// 시간
		int min;		// 분
		
		hour = 430 / spd;
		min = (430 % spd) * 60 / 100;		// 나머지 값을 60분 기준으로 환산
		
		System.out.print("총 주행 시간은 " + hour + "시간 ");
		System.out.println(min + "분");

	}

}
