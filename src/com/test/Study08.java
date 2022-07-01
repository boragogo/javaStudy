package com.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Study08 {

	public static void main(String[] args) {
		
		// 섭씨 -> 화씨 온도로 변경하기
		
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성
		
		System.out.println("섭씨 온도를 입력");
		
		float cel = sc.nextFloat();				// 섭씨 온도
		float fah;								// 화씨 온도
		fah = (float)(cel * 1.8 + 32);
		
		// 소수점 1자리로 출력
		DecimalFormat frmt = new DecimalFormat();	// decimalFormat 객체 생성
		frmt.setMaximumFractionDigits(1);			// 소수점 첫번째까지만 출력
		
		System.out.println("화씨 온도 : " + frmt.format(fah));		
	}
}
