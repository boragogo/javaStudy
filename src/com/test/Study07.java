package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Study07 {
	
	// 로또번호 1 ~ 45 숫자 중 6개 (+ 보너스 숫자) 뽑기

	public static void main(String[] args) {
		
		final int COUNT_OF_LOTTO_NUMBERS = 6;
		final int COUNT_OF_BONUS_NUMBERS = 1;
		
		// numberList 생성
		List<Integer> numberList = new ArrayList<Integer>();
		
		// 1 ~ 45까지 수를 numberList에 추가 
		for(int i = 1; i <= 45; i++) {
			numberList.add(i);
		}
		
		List<Integer> lottoNumbers = new ArrayList<>();
		List<Integer> bonusNumbers = new ArrayList<>();
		
	
		// numberList에서 6개 숫자 뽑아 myNumber 배열에 담기
		for(int i = 0; i < COUNT_OF_LOTTO_NUMBERS; i++) {
			int listSize = numberList.size();
			
			int num = (int)(Math.random() * listSize);
			lottoNumbers.add(numberList.get(num));
			
			// numberList에서 선택된 숫자 제거
			numberList.remove(num);
		} 
		
		for(int i = 0; i < COUNT_OF_BONUS_NUMBERS; i++) {
			int listSize = numberList.size();
			
			int num = (int)(Math.random() * listSize);
			bonusNumbers.add(numberList.get(num));
			
			numberList.remove(num);
		}
		
		Collections.sort(lottoNumbers);
	
		
		// 로또 번호 출력
		System.out.print("로또 번호 : ");
		for(int i = 0; i < lottoNumbers.size(); i++) {
			if (i > 0) {
				System.out.print(", ");
			} 
			System.out.print(lottoNumbers.get(i));
			
		} 
		System.out.println();
		
		// 보너스 번호 출력
		System.out.print("보너스번호 : ");
		for(int i = 0; i < bonusNumbers.size(); i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(bonusNumbers.get(i));
		}
	}
}
