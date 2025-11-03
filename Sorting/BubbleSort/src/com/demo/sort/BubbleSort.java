package com.demo.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void Bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println();
			System.out.println("iteration"+i);
			System.out.println(Arrays.toString(arr));
			
		}

	}
	
	public static void ImprovedBubble(int[] arr) {
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			flag =false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println();
			System.out.println("iteration"+i);
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
			
		}
		
	}
	
	
}
