package com.demo.test;

import java.util.Arrays;

import com.demo.bean.OneDArray;

public class test {
	public static void main(String[]args) {
		
	
	
	OneDArray ob=new OneDArray();
	ob.add1(30);
	ob.add1(40);
	ob.add1(50);
	ob.add1(20);
	ob.add(23, 2);
	System.out.println(ob);
	
	int total=ob.sum();
	System.out.println("sum is:"+total);
	
	int maximum=ob.max();
	System.out.println("maximum is:"+maximum);
	
	  int pos = ob.searchByValue(30);
      if (pos != -1)
          System.out.println("Value 30 found at position: " + pos);
      else
          System.out.println("Value 30 not found");
	



    
      boolean deleted = ob.deleteByPos(2); 
      if (deleted)
          System.out.println("Element deleted successfully.");
      else
          System.out.println("Invalid position, cannot delete.");

   
      System.out.println(ob);
      
      ob.reverseArray(true);
      System.out.println("\nAfter In-Place Reverse:");
      System.out.println(ob);

      int[] revArr = ob.reverseArray(false);
      System.out.println("\nReversed Copy (new array):");
      System.out.println(Arrays.toString(revArr));

	}
   }
  

	
	
	


