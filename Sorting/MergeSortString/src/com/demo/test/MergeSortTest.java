package com.demo.test;

import java.util.Arrays;

import com.demo.sort.MergeSortString;

public class MergeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {"kalyani","tanu","khushi","arya","sapana"};
        
        MergeSortString.MergeSort(arr,0,arr.length-1);
        System.out.println("final sorted");
        System.out.println(Arrays.toString(arr));
	}

}
