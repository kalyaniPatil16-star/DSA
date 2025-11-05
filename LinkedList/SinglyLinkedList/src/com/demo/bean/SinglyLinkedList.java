package com.demo.bean;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			next=null;
		}
		
	}
	  public SinglyLinkedList() {
		head = null;
	}
	  
	  public void AddByNode(int val) {
		  Node newnode=new Node(val);
		  if(head==null) {
			  head=newnode;
			  
		  }
		  else {
			  Node temp=head;
			  while(temp.next!=null) {
				  temp=temp.next;
			  }
			  temp.next=newnode;
		  }
	  }
	  
	  public void DisplayData() {
		  if(head==null) {
			  System.out.println("list is empty");
		  }else {
			  for(Node temp=head;temp!=null;temp=temp.next) {
				  System.out.print(temp.data+"--->");
			  }
			  System.out.println("null");
		  }
	  }
	  
	  public void AddByPos(int pos,int num) {
		  Node newnode=new Node(num);
		  
		  if(pos==1) {
			  newnode.next=head;
			  head=newnode;
		  }else {
			  Node temp=head;
			  for(int i=0;temp!=null&&i< pos-2;i++) {
				  temp=temp.next;
			  }if(temp!=null) {
				  newnode.next=temp.next;
				  temp.next=newnode;
			  }
			  else {
				  System.out.println("Given position is beyond length");
			  }
		  }
		  
	  }
	  
	  public void AddByValue(int val,int num) {
		  Node newnode=new Node(val);
		  Node temp=head;
		  while(temp!=null&& temp.data!=num) {
			  temp=temp.next;
			  
		  }if(temp!=null) {
			  newnode.next=temp.next;
			  temp.next=newnode;
		  }else {
			  System.out.println("not found");
		  }
		  
	  }
	
}
