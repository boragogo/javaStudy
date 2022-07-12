package com.test;

import java.util.ArrayList;

public class Study07 {
	
	// 로또 1 ~ 45 숫자 중 6개 뽑기

	public static void main(String[] args) {
			
		// ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 1 ~ 45까지 수를 ArrayList에 추가
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}		
		
		System.out.print(list + " ");
		
		int rd = (int)((Math.random() * list.size()));
		
		list.remove(rd - 1);
		
		System.out.println("\n" + rd + " ");
		// System.out.println(list);
		
		
				
	}
	
}
