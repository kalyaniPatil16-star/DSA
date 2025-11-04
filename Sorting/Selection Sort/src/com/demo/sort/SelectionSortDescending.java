package com.demo.sort;

import java.util.Arrays;

public class SelectionSortDescending {
	public static int FindMax(int[]arr,int start) {
		int maxpos=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[maxpos]<arr[i]) {
				maxpos=i;
			}
		}
		
		return maxpos;
		
	}
	public static void SelectionSortDesc(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int maxpos=FindMax(arr,i);
			
			int temp=arr[i];
			arr[i]=arr[maxpos];
			arr[maxpos]=temp;
			System.out.println();
			System.out.println("itertion"+i);
			System.out.println(Arrays.toString(arr));
			
			
		}
	}

}
