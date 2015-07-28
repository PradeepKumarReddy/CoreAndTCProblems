package com.algorithms.sort;

public class SelectionSort {

	public int[] selectionSort(int[] arr) {
		int size = arr.length;
		int i = 0;
		while (i < size) {
			int smallIndex = i;
			int small = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < small) {
					smallIndex = j;
					small = arr[j];
				}
			}
			swap(arr, smallIndex, i);
			i++;
		}
		return arr;
	}

	public void swap(int[] arr, int current, int swap) {
		int temp = arr[current];
		arr[current] = arr[swap];
		arr[swap] = temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = { 3, 2, 1, 4, 1, 5, 2, 3 };
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42,-1, -10 };
		arr = sort.selectionSort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
