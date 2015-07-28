package com.algorithms.sort;

public class BubbleSort {

	public int[] bubleSort(int[] arr) {
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					swap(arr, i, i + 1);
					swapped = true;
				}
			}
		}
		while (swapped) ;
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
		BubbleSort sort = new BubbleSort();
		int[] arr = { 3, 2, 1, 4, 1, 5, 2, 3 };
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		arr = sort.bubleSort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
