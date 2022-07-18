package com.test;

import java.util.Random;

public class Study10 {
	
	// y=x^2+1 그래프 -> 특정범위에서 x축과의 면적 구하기

	public static void main(String[] args) {
		
		Long m1 = System.currentTimeMillis();	// 프로세스 시작 시간
		
		Random rd1 = new Random(System.currentTimeMillis());
		Random rd2 = new Random(rd1.nextLong());
		
		int in = 0;		// 조건을 충족하는 값 개수
		int out = 0;	// 조건을 충족하지 못하는 값 개수
		
		int num = 100000;	// 조건 반복 횟수
		
		for(int i = 0; i < num; i++) {
			double x = rd1.nextDouble(1,3);
			double y = rd2.nextDouble(2,10);
			double result = x * x + 1;
			
			if(y <= result) {
				in ++;
			} else {
				out ++;
			}
		}
		
		double rect = (10 - 2) * (3 - 1);	// x, y의 전체 영역
		double ratio = (double)in / num;	// y의 in 비율
		
		System.out.println("in : " + in);
		System.out.println("out : " + out);
		System.out.println("비율 : " + ratio);
		System.out.println("면적 : " + rect * ratio);	
		
		Long m2 = System.currentTimeMillis();
		System.out.println(m2 - m1);
	}
}
