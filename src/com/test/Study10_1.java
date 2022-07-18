package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Study10_1 {
	
	// y=x^2+1 그래프 / 특정범위에서 x축과의 면적 구하기 => Thread 사용

	public static void main(String[] args) throws InterruptedException {
		
		int cntThreads= 4;
		Long m1 = System.currentTimeMillis();
		
		List<MyRunnable> list = new ArrayList<>();
		
		for(int i=0; i<cntThreads; i++) {
			MyRunnable r = new MyRunnable();
			list.add(r);
			r.start();
		}
		
		// 쓰레드 전체 종료시까지 대기
		for(int i=0; i<cntThreads; i++) {
			list.get(i).join();
		}
		
		long inTot = 0;
		long outTot = 0;

		for(int i=0; i<cntThreads; i++) {
			inTot += list.get(i).in;
			outTot += list.get(i).out;
		}
		
		System.out.println("in: " + inTot);
		System.out.println("out: " + outTot);
		
		long total = inTot + outTot;
		double rect = (10 - 2) * (3 - 1);
		double ratio = (double)inTot / total;
		
		System.out.println("비율: " + ratio);
		System.out.println("면적: " + (rect * ratio));
		Long m2 = System.currentTimeMillis();
		
		System.out.println(m2-m1);
	}
}

class MyRunnable extends Thread{
	
	int in = 0; // 함수 조건이 충족되는 값의 갯수
	int out = 0; // 충족 안되는 값의 갯수
	
	@Override
	public void run() {
		Random rd1 = new Random(System.currentTimeMillis());
		Random rd2 = new Random(rd1.nextLong());
		
		long num = 500_000_000;
		
		for(int i = 1; i <= num; i++) {
			double x = rd1.nextDouble(1,3);
			double y = rd2.nextDouble(2,10);
			
			double result = x * x + 1;
			if( y <= result) {
				in++;
			} else {
				out++;
			}
		}
	}
}

