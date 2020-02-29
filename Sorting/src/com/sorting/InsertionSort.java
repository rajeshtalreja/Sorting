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
		 * 1 - The best case occurs when the list is already sorted so the inner loop will not execute so it will be O(n)
		 * This is the best sorting algorithm when you know that the list is almost sorted like { 4 9 10 25 20 }.
		 * 
		 * 2 - This is most suited for small arrays as it runs fast.
		 * 
		 * 3 - This is not the exchange sort we don't swap the elements.
		 * 
		 * 4 - Average number of comparisons for putting kth element at the correct position is (k+1)/2 - We need to shift the k-1 elements max but
		 *     in average case the correct position is found out at mid so (k+1)/2
		 *     
		 * 5 - arranging a pack of playing cards into sorted order is similar to insertion sort
		 * 
		 * 6 - Can the complexity of the algorithm be reduced by searching the position of the element with binary search. The answer is no because if
		 *     we are able to search the position then also we need to shift the element from that position to the current element which is again O(n)
		 *     So the complexity will be O(n2) itself.
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
