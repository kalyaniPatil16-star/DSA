package com.demo.test;

import com.demo.bean.SinglyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList slist=new SinglyLinkedList();
        slist.AddByNode(10);
        slist.AddByNode(20);
        slist.AddByNode(30);
        slist.DisplayData();
        slist.AddByPos(2, 13);
        slist.DisplayData();
        slist.AddByValue(12, 20);
        slist.DisplayData();
        slist.DeleteBydata(20);
        slist.DisplayData();
        slist.DeleteByPos(2);
        slist.DisplayData();
	}

}
