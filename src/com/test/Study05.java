package com.test;

import java.util.Scanner;	// Scanner 클래스 호출

public class Study05 {

	public static void main(String[] args) {
		
		// 사각형 면적구하기
		
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성

		System.out.println("가로 길이(cm)를 입력하세요.");
		int recWidth = sc.nextInt();			// 사각형 가로 길이
		
		System.out.println("세로 길이(cm)를 입력하세요.");
		int recHeight = sc.nextInt();			// 사각형 세로 길이
		
		int recArea = recWidth * recHeight; 	// 사각형 넓이
		
		System.out.println("사각형의 면적은? \n" + recArea + "제곱센티미터");	

	}
}