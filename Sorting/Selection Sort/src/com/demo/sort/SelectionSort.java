package com.demo.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static int Findmin(int [] arr,int start) {
		int minpos=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[minpos]>arr[i]) {
				minpos=i;
			}
		}
		return minpos;
	}
  public static void SelectionSort(int[] arr) {
	  
	  for(int i=0;i<arr.length-1;i++) {
		  int minpos=Findmin(arr,i);
		  
		  int temp=arr[i];
		  arr[i]=arr[minpos];
		  arr[minpos]=temp;
		  System.out.println(Arrays.toString(arr));
	  }
  }
}
