package com.test;

public class Study05 {
	
	// 1 ~ 100 사이 10개의 난수로 버블정렬하기
	
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 자연수에서 10개 난수 생성		
		int[] arr = new int[10];
		
		// 정렬 전 배열
		System.out.print("정렬 전 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random()) * 100 + 1);
			
			// 난수 중복 확인
			for( int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			System.out.print(arr[i] + " ");
		}		
		
		// 오름차순 버블 정렬
		bubbleSort(arr);
		
		// 정렬 후 배열
		System.out.print("\n정렬 후 : ");
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
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
