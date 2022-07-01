package com.test;

import java.util.Scanner;		// Scanner 클래스 호출

public class Study06 {

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 성적을 입력받아 총점과 평균 구하기
		
		Scanner sc = new Scanner(System.in);		// scanner 객체 생성
		
		System.out.println("국어 점수 입력");
		
		int sbjKor = sc.nextInt();		// 국어 점수
		
		System.out.println("영어 점수 입력");
		
		int sbjEng = sc.nextInt();		// 영어 점수
		
		System.out.println("수학 점수 입력");
		int sbjMath = sc.nextInt();			// 수학 점수 
		
		int total = sbjKor + sbjEng + sbjMath;		// 점수 총합
		int avg = total / 3;							// 평균 점수
		
		System.out.println("총점은 " + total + "점" + "\n평균은 " + avg + "점");
	}

}
