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
		
		/**
		 * Insertion sort is good for the list which is almost sorted.
		 * 
		 * Complexity 
		 * 
		 * Time 
		 * 
		 * Best			Average		Worst
		 * O(n)			O(n2)		O(n2)
		 * 
		 * Space
		 * O(1) - temp space
		 * 
		 * The best case occurs when the list is already sorted so the inner loop will not execute so it will be O(n)
		 * This is the best sorting algorithm when you know that the list is almost sorted like { 4 9 10 25 20 }.
		 * 
		 */
		
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
