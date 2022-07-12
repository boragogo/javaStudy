package com.test;

public class Study05 {
	
	// 1 ~ 100 사이 10개의 난수로 버블정렬하기
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
				
		System.out.print("정렬 전 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			// 1 ~ 100 사이의 자연수에서 10개 난수 생성	
			arr[i] = (int)((Math.random()) * 100) + 1;
			
//			난수 중복 확인
//			for( int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//				}
//			}
			
			// 정렬 전 배열
			System.out.print(arr[i] + " ");
		}					
		
		// 오름차순 버블 정렬
		bubbleSort(arr);
		
		System.out.print("\n정렬 후 : ");
		
		// 정렬 후 배열
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		int comp = arr.length - 1;
		
		// 2개의 수 비교
		for(int i = 0; i < comp; i++) {
			
			for(int j = 0; j < comp - i; j++) {
				
				if( arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
