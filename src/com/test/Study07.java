package com.test;

import java.text.DecimalFormat;		// DecimalFormat 클래스 호출
import java.util.Scanner;			// Scanner 클래스 호출

public class Study07 {

	public static void main(String[] args) {
		
		// 화씨 -> 섭씨 온도로 변경하기
		
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성
		
		System.out.println("화씨 온도를 입력");
		
		float fah = sc.nextFloat();				// 화씨 온도			
		float cel;								// 섭씨 온도
		cel = (float)((fah-32)*0.56);
		// float cel = (fah - 32) * 10 / 18;
		
		// 소수점 1자리로 출력
		DecimalFormat frmt = new DecimalFormat();	// decimalFormat 객체 생성
		frmt.setMaximumFractionDigits(1);			// 소수점 첫번째까지만 출력
		
		System.out.println("섭씨 온도 : " + frmt.format(cel));
	}
}