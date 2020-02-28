package com.sorting;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 6, 8, 11, 15 };
		System.out.println(Arrays.toString(arr));
		//buildHeap(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heapSort(int arr[]) {
		
		buildHeap(arr, arr.length);
		int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			swap(arr, i, 0);
			buildHeap(arr, i);
		}
	}

	public static void buildHeap(int arr[], int n) {

		int startIndex = n / 2 - 1;
		for (int i = startIndex; i >= 0; i--) {
			heapify(arr, n, i);
		}
	}

	public static void heapify(int[] arr, int n, int i) {

		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int root = i;
		int largest = root;
		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if (largest != root) {
			swap(arr, largest, root);
			heapify(arr, n, largest);
		}
	}

	private static void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

}
