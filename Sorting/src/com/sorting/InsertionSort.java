package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = new int[] {10,9,4,20,25,6};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			for(; j >= 0 && arr[j] > temp;j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
}
