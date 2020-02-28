package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = new int[] {10,9,4,20,25,6};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = findMin(arr,i+1,arr.length);
			if(arr[i] > arr[minIndex]) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	private static int findMin(int[] arr, int i, int length) {
		int min = arr[i];
		int minIndex = i;
		for(int j = i;j<length;j++) {
			if(arr[j] < min) {
				min = arr[j];
				minIndex = j;
			}
		}
		return minIndex;
	}

}
