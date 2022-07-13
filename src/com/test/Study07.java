package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Study07 {
	
	// 로또 1 ~ 45 숫자 중 6개 뽑기

	public static void main(String[] args) {
		
		// numberList 생성
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		// 1 ~ 45까지 수를 numberList에 추가 
		for(int i = 1; i <= 45; i++) {
			numberList.add(i);
		}
		
		// 로또번호 6개 담을 myNumber 배열 생성
		int[] myNumber = new int[7];
		
		int mylen = myNumber.length;
		int listSize = numberList.size();
		
		// numberList에서 6개 숫자 뽑아 myNumber 배열에 담기
		for(int i = 0; i < mylen; i++) {
			
			int num = (int)(Math.random() * listSize - 1);
			
			myNumber[i] = numberList.get(num);
			
			// numberList에서 선택된 숫자 제거 
			numberList.remove(num);	
		}
		
		// myNumber 배열 오름차순 정렬 (보너스 번호 제외)
		Arrays.sort(myNumber,0,6);
		
		// 6개 숫자 출력
		for(int i = 0; i < mylen - 1; i++) {
			System.out.print(myNumber[i] + " ");
		}
		
		// 보너스 번호 출력
		System.out.print(" 보너스 번호: " + myNumber[6]);
	}
}
