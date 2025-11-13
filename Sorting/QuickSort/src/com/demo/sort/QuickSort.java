package com.demo.sort;

public class QuickSort {
	public void Quicksortt(int[] arr,int start,int end) {
		if(start<end) {
		int p=partition(arr,start,end);
		Quicksortt(arr,start,p-1);
		Quicksortt(arr,p+1,end);
		}
		
		
		
	}
	
	public int partition(int[] arr,int start,int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j] >arr[pivot] ) {
				j--;
			}
			
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		if(pivot!=j) {
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
		}
		return j;
		
	}

}
