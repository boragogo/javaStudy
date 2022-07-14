package com.test;

import java.util.ArrayList;

public class Study06 {
	
	// 1 ~ 100 사이 10개의 난수 버블정렬하기 => ArrayList

	public static void main(String[] args) {
		
		// ArrayList 생성
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		// 10개 난수 ArrayList에 추가
		for(int i = 1; i <= 10; i++) {
			int num = (int)((Math.random() * 100) + 1);
			numberList.add(num);
		}
		
		System.out.println("정렬 전 : " + numberList);
		
		// 오름차순 버블 정렬
		bubbleSort(numberList);
		
		System.out.println("정렬 후 : " + numberList);		
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {		
		int comp = arr.size() - 1;
		
		// 2개의 수 비교
		for(int i = 0; i < comp; i++) {
			
			for(int j = 0; j < comp - i; j++) {		
				
				if( arr.get(j) > arr.get(j+1) ) {
					
					int temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		return arr;
	}
}
