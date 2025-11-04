package com.demo.test;

import com.demo.sort.SelectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,45,44,34,78,33};
		int minIndex=SelectionSort.Findmin(arr, 0);
		System.out.println("Minimum element from index 1 is: " + arr[minIndex]);
		SelectionSort.SelectionSort(arr);

	}

}
