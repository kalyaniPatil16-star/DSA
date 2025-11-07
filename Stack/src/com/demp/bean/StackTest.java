package com.demp.bean;

import com.demo.test.StackLinked;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinked slist=new StackLinked();
		slist.push(12);
		slist.push(22);
		slist.push(20);
		slist.push(30);
		slist.push(45);
		
		System.out.println("pop:"+slist.pop());
		

	}

}
