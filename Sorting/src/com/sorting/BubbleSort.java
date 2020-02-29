package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = new int[] {10,9,4,20,25,6};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int arr[]) {
		
		/**
		 * Bubble sort
		 * 
		 * Complexity
		 * 
		 * Time
		 * 
		 * Best 	Average 	Worst
		 * O(n2)	O(n2)		O(n2)
		 * 
		 * Space
		 * O(1)
		 * 
		 * 
		 * 
		 */
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
