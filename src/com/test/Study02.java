package com.test;

public class Study02 {

	public static void main(String[] args) {
		
		int sum1 = 0;	// 2의 배수의 합
		int sum2 = 0;	// 5의 배수의 합
		int sum3 = 0;	// 2 또는 5의 배수의 합
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
			if (i % 5 == 0) {
				sum2 += i;
			}
			if (i % 2 == 0 || i % 5 == 0) {
				sum3 += i;
			}
		}
		
		System.out.println("2의 배수의 합은 " + sum1 + "\n5의 배수의 합은 " + sum2 + "\n2 또는 5의 배수의 합은 " + sum3 );

	}

}
