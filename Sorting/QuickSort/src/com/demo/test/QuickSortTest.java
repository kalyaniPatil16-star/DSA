package com.demo.test;

import java.util.Arrays;

import com.demo.sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,45,56,78,89,67,56};
		QuickSort qs=new QuickSort();
		qs.Quicksortt(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
