package com.test;

import java.util.ArrayList;
import java.util.List;

public class Study08 {
	
	// 로또번호 뽑기 두번째 => 정렬, 메소드 사용

	public static void main(String[] args) {
		
		// 로또번호, 보너스번호 상수 선언
		final int COUNT_OF_LOTTO_NUMBERS = 6;
		final int COUNT_OF_BONUS_NUMBERS = 1;
		
		// 로또번호, 보너스번호 리스트 객체 생성
		List<Integer> lottoNumbers = new ArrayList<>();
		List<Integer> bonusNumbers = new ArrayList<>();
		
		// 로또 번호 추출 리스트
		lottoNumbers = getLottoBall(COUNT_OF_LOTTO_NUMBERS);
		
		// 보너스 번호 추출 리스트
		bonusNumbers = getLottoBall(COUNT_OF_BONUS_NUMBERS);
		
		// 로또 번호 오름차순 정렬
		bubbleSort(lottoNumbers);
		
		// 로또 번호 출력
		System.out.print("Lotto Numbers : ");
		selectedBall(lottoNumbers);
		
		System.out.println();
		
		// 보너스 번호 출력
		System.out.print("Bonus Numbers : ");
		selectedBall(bonusNumbers);
	}
		
	// 번호 추출 메소드
	public static List<Integer> getLottoBall(int cnt) {
		
		// 1 ~ 45까지 수를 numberList에 추가 
		List<Integer> numberList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45; i++) {
			numberList.add(i);
		}
		
		// 추출 번호 담을 List 추가
		List<Integer> ballList = new ArrayList<>();
		
		for(int i = 0; i < cnt; i++) {
			
			int listSize = numberList.size();
			
			int num = (int)(Math.random() * listSize);
			ballList.add(numberList.get(num));
			
			// List에서 선택된 숫자 제거
			numberList.remove(num);
		}
		return ballList;
	}
	
	// 번호 출력 메소드
	public static List<Integer> selectedBall(List<Integer> list) {
				
		for(int i = 0; i < list.size(); i++) {
			if (i > 0) {
				System.out.print(", ");
			} 
			System.out.print(list.get(i));
		}
		return list;
	}
	
	// 오름차순 정렬 메소드
	public static List<Integer> bubbleSort(List<Integer> list) {
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size() - 1 - i; j++) {
				if(list.get(j) > list.get(j+1)) {
					int temp = list.get(j);
					list.set( j, list.get(j+1) );
					list.set( j+1, temp);
				}
			}
		}
		return list;
	}
	
}
