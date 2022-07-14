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
		
		// 추출한 로또 번호 리스트에 추가
		lottoNumbers = getLottoBall(COUNT_OF_LOTTO_NUMBERS);
		
		// 추출한 보너스 번호 리스트에 추가
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
		
	// 번호 추출 메서드
	public static List<Integer> getLottoBall(int cnt) {
		
		// 1 ~ 45까지 수를 numberList에 추가 
		List<Integer> numberList = new ArrayList<Integer>();
		
		addValueList(numberList);
		
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
	
	// 리스트에 새로운 값 추가 메서드
	public static List<Integer> addValueList(List<Integer> valueList) {
		
		for(int i = 1; i <= 45; i++) {
			valueList.add(i);
		}
		return valueList;
	}	
	
	// 번호 출력 메서드
	public static List<Integer> selectedBall(List<Integer> selectedList) {
				
		for(int i = 0; i < selectedList.size(); i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(selectedList.get(i));
		}
		return selectedList;
	}
	
	// 오름차순 정렬 메서드
	public static List<Integer> bubbleSort(List<Integer> ascList) {
		
		for(int i = 0; i < ascList.size(); i++) {
			for(int j = 0; j < ascList.size() - 1 - i; j++) {
				if(ascList.get(j) > ascList.get(j+1)) {
					int temp = ascList.get(j);
					ascList.set( j, ascList.get(j+1) );
					ascList.set( j+1, temp);
				}
			}
		}
		return ascList;
	}
	
}
