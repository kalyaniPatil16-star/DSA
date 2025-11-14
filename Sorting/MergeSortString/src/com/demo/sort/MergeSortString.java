package com.demo.sort;

public class MergeSortString {
	public static void MergeSortString(String[] arr,int start,int mid,int end) {
		
		int n1=mid-start+1;
		int n2=end-mid;
		
		String[] leftarray=new String[n1];
		String[] rightarray=new String[n2];
		
		for(int i=0;i<n1;i++) {
			leftarray[i]=arr[start+i];
		}
		
		for(int j=0;j<n2;j++) {
			rightarray[j]=arr[mid+1+j];
		}
		
		int i=0,j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i].compareTo(rightarray[j])<=0) {
				arr[k]=leftarray[i];
				i++;
				k++;
				
			}
			else {
				arr[k]=rightarray[j];
				j++;
				k++;
				
			}
		}
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		
	
		
	}
	
	public static void MergeSort(String[] arr,int start,int end) {
		if(start<end) {
		int mid=(start+end)/2;
		MergeSort(arr,start,mid);
		MergeSort(arr,mid+1,end);
		MergeSortString(arr,start,mid,end);
		}
		
		
		
		
		
	}

	

}
