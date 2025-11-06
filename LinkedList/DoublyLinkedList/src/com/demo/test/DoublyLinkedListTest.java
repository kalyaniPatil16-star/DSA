package com.demo.test;

import com.demo.bean.DoublyLinkedList;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.addNode(20);
		dlist.DisplayData();
		dlist.addData(2, 22);
		dlist.DisplayData();
		dlist.AddBypos(3, 45);
		dlist.DisplayData();

	}

}
