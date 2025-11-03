package com.demo.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void InsertionSort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}
	public static void InsertionSortDesc(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println();
			System.out.println("iteration"+i);
			System.out.println(Arrays.toString(arr));
		}
	}
}
