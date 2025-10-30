package com.demo.bean;

import java.util.Arrays;

public class OneDArray {
	private int[]arr;
	private int count;
	
	public OneDArray() {
		arr=new int[10];
		count=0;
	}
	public OneDArray(int[]arr,int count) {
		this.arr=arr;
	}
	public OneDArray(int size) {
		arr=new int[size];
		count=0;
		
	}
    @Override
	public String toString() {
		return "OneDArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	public int getcapacity() {
		return arr.length;
    	
    }
    public int getsize() {
		return count;
    	
    }
    
    public boolean add1(int x) {
    	if(count < arr.length) {
    		arr[count]=x;
    		count++;
    		return true;
    		
    	}
		return false;
    	
    }
    public int sum() {
    	int sum=0;
    	for(int i=0;i<count;i++) {
    		sum+=arr[i];
    		
    	}
		return sum;
    	
    }
    public boolean deleteByPos(int pos) {
		if(pos!=count) {
			for(int i=0;i<count-1;i++) {
				arr[i]=arr[i+1];
				
			}
			return true;
		}
		return false;
		
	}
	
	public int searchByValue(int value) {
		for(int i=0;i<count;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
    public int max() {
    	int max=arr[0];
    	for(int i=0;i<count;i++) {
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    		
    	}
		return max;
    	
    }
    public boolean add(int value,int pos) {
		if(count<arr.length && count >pos) {
			for(int i=count;i>=pos;i--) {
				arr[i]=arr[i+1];
			}
			arr[pos]=value;
			return true;
		}
		return false;
	}
    public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=count-1;i<count;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[j]=temp;
			}
			return arr;
		}
		else {
			int[] a= new int[count];
			for(int i=count-1,k=0;i>=0;i--,k++) {
				a[k]=arr[i];
			}
			return a;
		}
	}
	
}
