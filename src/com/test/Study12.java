package com.test;

import java.util.Scanner;

public class Study12 {

	public static void main(String[] args) {
		
		// 성적처리
		// 이름, 국어, 영어, 수학의 성적을 입력받고 1) 총점 2) 평균 구하기
		// 평균이 90점 이상이면 수, 80점 이상이면 우, 70점 이상이면 미, 60점 이상이면 양, 나머지 가로 표기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String stdName = sc.next();			// 학생 이름
		
		System.out.print("국어 점수 : ");
		int Kor = sc.nextInt();				// 국어 점수
		
		System.out.print("영어 점수 : ");
		int Eng = sc.nextInt();				// 영어 점수

		System.out.print("수학 점수 : ");
		int Math = sc.nextInt();			// 수학 점수
		
		int total = Kor + Eng + Math;		// 총점
		float avg = total / 3;				// 평균
		String grade;						// 성적등급
		
		if(avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else if (avg >= 60) {
			grade = "양";
		} else {
			grade = "가"	;
		}
		
		System.out.println(stdName + " 학생 성적");
		System.out.println("총 점수 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("성적등급 : " + grade);
	}
}
