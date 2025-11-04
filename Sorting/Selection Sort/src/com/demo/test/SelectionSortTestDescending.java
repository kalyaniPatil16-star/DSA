package com.demo.test;

import com.demo.sort.SelectionSortDescending;

public class SelectionSortTestDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,34,22,45,67,89,90};
		int maxIndex = SelectionSortDescending.FindMax(arr, 0);
		System.out.println("Maximum element is: " + arr[maxIndex]);
		SelectionSortDescending .SelectionSortDesc(arr);

	}

}
