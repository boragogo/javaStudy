package com.test;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Study10 {
	
	// y=x^2+1 그래프 -> 특정범위에서 x축과의 면적 구하기

	public static void main(String[] args) {
		
		Random rd = new Random();
//		rd.setSeed(System.currentTimeMillis());
		
		List<Double> point1 = new ArrayList<>();
		List<Double> point2 = new ArrayList<>();
		
		double x = rd.nextDouble(1,3);
		double y = rd.nextDouble(0,10);
		
		int num = 1000;
		double result = Math.pow(x, 2) + 1;
		
		for(int i = 1; i <= num; i++) {
			if(y <= result) {
				point1.add(x);
				point2.add(y);
			}
		}
	}
}
